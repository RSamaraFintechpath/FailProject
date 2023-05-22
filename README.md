## Description:  
* In this guide, we will demonstrate the process of integrating `SwaggerUI` with your `SpringBoot Application`.  

* The main objective of establishing this connection is to generate documentation for your project.  
By integrating SwaggerUI with your SpringBoot Application, you can easily create comprehensive documentation that describes your API endpoints, request/response models, and other relevant details. Also, we will describe annotations to be used that follow SAIB standards.  

### Steps to Activate SwaggerUI on SpringBoot Application:  
**Note that we'll use SpringFox to generate SwaggerUI**

1. **Add Maven Dependencies in pom.xml file:**  

```
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger2</artifactId>
	<version>2.9.2</version>
</dependency>  

<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger-ui</artifactId>
	<version>2.9.2</version>
</dependency>
```  

2. **Create seperate package and name it "swagger-config", and create a class inside that package and name it "SwaggerConfig"**  

![swagger config](https://github.com/RSamaraFintechpath/FailProject/assets/125183735/222628df-a36b-4130-8b56-e9399fe3de5d)






