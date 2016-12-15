import tweepy
import psycopg2
import sys


cont = 0
lst_tweet = []
qtd_tweet = 10


def salvar_bd():
    # Conecta com o BD criado no postgres
    DB = psycopg2.connect(host='localhost', dbname='SMO', user='postgres', password='Cc98576036')
    
    cursor = DB.cursor()
    
    # criando a tabela se ela não existir
    cursor.execute('CREATE TABLE IF NOT EXISTS table_twitter (id serial PRIMARY KEY, twitter varchar(250));')
    
    # varrendo cada tweet armazenado na lista de tweet
    for tweets in lst_tweet:
        # tirando caracter de bycode(b'')
        tweet = str(tweets).split("'")
        # inserindo o tweet no banco
        cursor.execute("INSERT INTO table_twitter (twitter) VALUES ('"+tweet[1]+"');")
        
    # commitando os inserts
    DB.commit()
    cursor.close()
    
    # fechando o banco
    DB.close()
    
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
        lst_tweet.append(status.text.encode('utf-8'))
        
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
    
    # minhas credenciais
    consumer_key = **sua consumer_key**
    consumer_secret = **sua consumer_secret**
    access_token = **seu access_token**
    access_token_secret = **seu access_token_secret**
    
    # instanciando o "escutador"
    listener = StdOutListener()
    
    # passando as credenciais
    auth = tweepy.OAuthHandler(consumer_key, consumer_secret)
    auth.set_access_token(access_token, access_token_secret)
    
    # criando a stream e passando o escutador e as credenciais
    stream = tweepy.Stream(auth, listener)
    
    # passando as palavras que eu quero que sejam procuradas nos tweets
    stream.filter(track=['temperatura', 'transporte', 'caixa termica', 'orgao', 'doação', 'transplante'])
