
Links:

https://medium.com/swlh/build-deploy-a-rest-api-from-scratch-using-spring-boot-and-aws-ecs-eb369137a020

https://www.baeldung.com/spring-boot-docker-images

https://spring.io/guides/topicals/spring-boot-docker


Docker Commandos:

#Criar uma imagem com a tag de nome hello:
                        docker build -t hello .


#Configurar o arquivo de credenciais em ~\.aws\credentials:
                        aws configure

#Autenticar
                         aws ecr get-login-password --region sa-east-1 | docker login --username AWS --password-stdin 621827144991.dkr.ecr.sa-east-1.amazonaws.com

#Criar um Repositorio
                        aws ecr create-repository --repository-name hello                 

#Fazer um tag compativel para push no ECR   

                        docker tag hello:latest 621827144991.dkr.ecr.sa-east-1.amazonaws.com/hello

#Fazer o push para o AWS

                        docker push 621827144991.dkr.ecr.sa-east-1.amazonaws.com/hello