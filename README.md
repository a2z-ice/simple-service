# simple-service

```shell
docker run --rm -v \
$PROJECT_LOCATION:/app \
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