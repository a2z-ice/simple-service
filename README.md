# simple-service
```shell

# To install selfsign ca in keytool do following for os like ubuntu
cp ca.crt /usr/local/share/ca-certificates/
# then run following command
update-ca-certificates
# then restart your container daemon if it is docker
systemctl restart docker

# To install selfsign ca in keytool do following for java application for example java run in docker

docker run -it --rm -v $(pwd):/app -w /app eclipse-temurin:17.0.11_9-jdk-focal bash
keytool -import -alias uniqe_alias_name ca.crt -keystore /opt/java/openjdk/lib/security/cacerts -storepass changeit

# To list all trusted ca
keytool -list -keystore /opt/java/openjdk/lib/security/cacerts -storepass changeit
```


```shell
docker run --rm \
-v $PROJECT_LOCATION:/app \
-v $M2_REPO:/root/.m2/ -w /app \
maven:3.9.6-eclipse-temurin-17 \
mvn clean package -B \
-Dmaven.test.skip=true -Dactive.profile=prod

```

# for local
curl http://10.10.10.1:30080/customer?customerId=100
# for kubernetes 

```shell
curl http://10.10.10.1:30080/customer?customerId=100
```
