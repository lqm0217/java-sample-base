## Function
>* Restful API
>* Swagger UI
>* Mybatis
>* Mybatis-PageHelper
>* Mybatis Generator
>* Flyway

### IDE
>[IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/#section=windows)
### Local Server
>domain: http://localhost:8081
### MySql Server
>jdbc:mysql://localhost:3306/warehouse
### Swagger UI
>[Page](http://localhost:8081/swagger-ui.html#/)
### Paging
>* Use [Mybatis-PageHelper](https://github.com/abel533/MyBatis-Spring-Boot)
>* Sample:[getOrders](http://localhost:8081/swagger-ui.html#/order-controller/getOrdersUsingPOST)
### Mybatis Generator
>* Use [Mybatis Generator](https://github.com/mybatis/generator)
>* file[src\main\resources\generatorConfig.xml]
>mouse right click=>Run Maven=>mybatis-generator:generate

### Docker
>first need to install docker
>* Create docker image(run in CMD or PowerShell, [<font color=#FF0000 >**.**<font>] is necessary)
>  <pre>docker build -t java-sample-base .</pre>
>* Create docker container
>  <pre>docker run -it --rm --name sample -p 8081:8081 -d java-sample-base</pre>