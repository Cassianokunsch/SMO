import tweepy
import sys
import psycopg2

p_palavras = []
cont = 0
limit = 1000


class StdOutListener(tweepy.StreamListener):
    ''' Handles data received from the stream. '''

    def on_status(self, status):
        global cont
        global limit
        cont = cont + 1
        print(cont)

        # Captura os twitters e coloca em uma lista
        p_palavras.append(status.text)

        if (cont == limit):
            salvar_bd()

    def on_error(self, status_code):
        if status_code == 420:
            # Retornando falso em on_data desliga
            print("ERRO! Fechar feed.")
            salvar_bd()

        return False


def salvar_bd():
    # Conecta com o BD criado no postgres
    DB = psycopg2.connect(host='localhost', dbname='SMO', user='postgres', password='Cc98576036')
    # O cursos serve para fazer as operação, tipo: CREATE TABLE, SELECT e etc
    cursor = DB.cursor()
    # Utilizando o cursos pra criar a tabela
    cursor.execute('CREATE TABLE IF NOT EXISTS table_twitter (id serial PRIMARY KEY, twitter varchar(144);')
    for elemento in p_palavras:
        # Utilizando o cursos pra inserir os dados na tabela
        cursor.execute('INSERT INTO twitter (table_twitter) VALUES (%s);', (elemento))
    # Fechando/finalizando o BD como um todo
    DB.commit()
    cursor.close()
    DB.close()

    # Tudo já foi analisado e salvo, então informar isso e fechar o sistema
    print("Salvo com sucesso!")
    sys.exit()


if __name__ == '__main__':
    # Chaves de autenticação para se ter acesso a conta
    consumer_key = 'ORMqhNG7HUwajEuorEqeGWTCL'
    consumer_secret = '3v2CNlc85hE55XiDhtUNwzssnyhrMSYFBWK2bwJokaSyK8XvhS'
    access_token = '808615970378055680-ActX61hReGiFAxkdlyDn0l8MMy6E03n'
    access_token_secret = '4m1u1UOVOUaKSZB2Viky7gViZejMQMeInQzUIGaVxaM6v'

    auth = tweepy.OAuthHandler(consumer_key, consumer_secret)
    auth.set_access_token(access_token, access_token_secret)

    listener = StdOutListener()

    # passando autenticação e o "escutador" como parametros
    stream = tweepy.Stream(auth, listener)
    #  filtrando as frases pegas para somente aquelas que possuem a palavras abaixo
    stream.filter(track=['temperatura', 'transporte', 'caixa termica', 'orgao', 'doação', 'transplante'])
    # Chamando a funcao para pegar os twitters
    listener.on_status(tweepy.API(auth))




    p_palavras = ler_arq("bdPalavras", ".txt")
    print(p_palavras)
    #salvar_bd()
