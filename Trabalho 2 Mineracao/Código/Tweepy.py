import tweepy
import psycopg2
import sys


cont = 0
lst_tweet = []
qtd_tweet = 10


def salvar_bd():
    # Conecta com o BD criado no postgres
    DB = psycopg2.connect(host='localhost', dbname='SMO', user='postgres', password='Cc98576036')
    # O cursos serve para fazer as operação, tipo: CREATE TABLE, SELECT e etc
    cursor = DB.cursor()
    # Utilizando o cursos pra criar a tabela
    cursor.execute('CREATE TABLE IF NOT EXISTS table_twitter (id serial PRIMARY KEY, twitter varchar(250));')
    for tweets in lst_tweet:
        # Utilizando o cursos pra inserir os dados na tabela
        tweet = str(tweets).split("'")
        cursor.execute("INSERT INTO table_twitter (twitter) VALUES ('"+tweet[1]+"');")
    # Fechando/finalizando o BD como um todo
    DB.commit()
    cursor.close()
    DB.close()

    # Tudo já foi analisado e salvo, então informar isso e fechar o sistema
    print("Salvo com sucesso!")
    sys.exit()


class StdOutListener(tweepy.StreamListener):
 
    def on_status(self, status):
        global cont
        global limit
        cont = cont + 1
        print(cont)
        # Captura os twitters e coloca em uma lista
        # usei uft-8 para conseguir armazenar os tweets
        p_palavras.append(status.text.encode('utf-8'))
        
        # quando chegar na quantidade de tweet que eu quero vai salvar no banco
        if (cont == qtd_tweet):
            salvar_bd()
        
    def on_error(self, status_code):
        print('Got an error with status code: ' + str(status_code))
        return True # To continue listening
 
    def on_timeout(self):
        print('Timeout...')
        return True # To continue listening
 
if __name__ == '__main__':

    consumer_key = 'ORMqhNG7HUwajEuorEqeGWTCL'
    consumer_secret = '3v2CNlc85hE55XiDhtUNwzssnyhrMSYFBWK2bwJokaSyK8XvhS'
    access_token = '808615970378055680-ActX61hReGiFAxkdlyDn0l8MMy6E03n'
    access_token_secret = '4m1u1UOVOUaKSZB2Viky7gViZejMQMeInQzUIGaVxaM6v'
    
    listener = StdOutListener()
    auth = tweepy.OAuthHandler(consumer_key, consumer_secret)
    auth.set_access_token(access_token, access_token_secret)
 
    stream = tweepy.Stream(auth, listener)
    stream.filter(track=['temperatura', 'transporte', 'caixa termica', 'orgao', 'doação', 'transplante'])
