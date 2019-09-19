模版：
mybatis use with xml, maven.

操作：
1.创建数据库-mysql5.6
database=testForInternal
user=test
password=test

2.eclipse创建maven项目，'pom.xml'中添加一些可选配置
---
	//maven插件下载链接（由于未知错误阿里镜像无法下载）
	<pluginRepositories>
		<pluginRepository>
			<id>central</id>
			<url>http://repo1.maven.org/maven2</url>
		</pluginRepository>
	</pluginRepositories>
	//使用jdk1.7
	<profiles>
		<profile>
			<id>jdk-1.7</id>
			<activation>
				<activeByDefault>true</activeByDefault>
				<jdk>1.7</jdk>
			</activation>
			<properties>
				<maven.compiler.source>1.7</maven.compiler.source>
				<maven.compiler.target>1.7</maven.compiler.target>
				<maven.compiler.compilerVersion>1.7</maven.compiler.compilerVersion>
			</properties>
		</profile>
	</profiles>
	//其他的jar使用阿里镜像下载，比较快
	<repositories>
		<repository>
			<id>alimaven</id>
			<name>aliyun maven</name>
			<url>http://maven.aliyun.com/nexus/content/groups/public/</url>
		</repository>
	</repositories>
---

3.添加引入项目依赖的jar包
---
//25个jar

	<dependencies>

		<!-- mybtis -->
		<!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
	<dependency>
		<groupId>org.mybatis</groupId>
		<artifactId>mybatis</artifactId>
		<version>3.2.7</version>
	</dependency>

		<!-- mysql -->
		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
		<version>5.1.41</version>
		</dependency>
	

	<!-- https://mvnrepository.com/artifact/cglib/cglib -->
	<dependency>
		<groupId>cglib</groupId>
		<artifactId>cglib</artifactId>
		<version>2.2.2</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/commons-logging/commons-logging -->
	<dependency>
		<groupId>commons-logging</groupId>
		<artifactId>commons-logging</artifactId>
		<version>1.1.1</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/log4j/log4j -->
	<dependency>
		<groupId>log4j</groupId>
		<artifactId>log4j</artifactId>
		<version>1.2.17</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
	<dependency>
		<groupId>org.apache.logging.log4j</groupId>
		<artifactId>log4j-core</artifactId>
		<version>2.0-rc1</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.javassist/javassist -->
	<dependency>
		<groupId>org.javassist</groupId>
		<artifactId>javassist</artifactId>
		<version>3.17.1-GA</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-api -->
	<dependency>
		<groupId>org.slf4j</groupId>
		<artifactId>slf4j-api</artifactId>
		<version>1.7.5</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12 -->
	<dependency>
		<groupId>org.slf4j</groupId>
		<artifactId>slf4j-log4j12</artifactId>
		<version>1.7.5</version>
		<scope>test</scope>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/ognl/ognl -->
	<dependency>
		<groupId>ognl</groupId>
		<artifactId>ognl</artifactId>
		<version>2.6.9</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/commons-dbcp/commons-dbcp -->
	<dependency>
		<groupId>commons-dbcp</groupId>
		<artifactId>commons-dbcp</artifactId>
		<version>1.4</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/javax.transaction/transaction-api -->
	<dependency>
		<groupId>javax.transaction</groupId>
		<artifactId>transaction-api</artifactId>
		<version>1.1</version>
		<scope>provided</scope>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/junit/junit -->
	<dependency>
		<groupId>junit</groupId>
		<artifactId>junit</artifactId>
		<version>4.11</version>
		<scope>test</scope>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.apache.derby/derby -->
	<dependency>
		<groupId>org.apache.derby</groupId>
		<artifactId>derby</artifactId>
		<version>10.9.1.0</version>
		<scope>test</scope>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.apache.velocity/velocity -->
	<dependency>
		<groupId>org.apache.velocity</groupId>
		<artifactId>velocity</artifactId>
		<version>1.7</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.hsqldb/hsqldb -->
	<dependency>
		<groupId>org.hsqldb</groupId>
		<artifactId>hsqldb</artifactId>
		<version>2.2.9</version>
		<scope>test</scope>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.mockito/mockito-core -->
	<dependency>
		<groupId>org.mockito</groupId>
		<artifactId>mockito-core</artifactId>
		<version>1.9.5</version>
		<scope>test</scope>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/postgresql/postgresql -->
	<dependency>
		<groupId>postgresql</groupId>
		<artifactId>postgresql</artifactId>
		<version>9.1-901.jdbc3</version>
	</dependency>
	
	</dependencies>

---

4.创建mybatis核心配置文件'mybatis-config.xml',并且配置数据库信息,mapper信息

5.创建pojo，mapper包并对应存储pojo/mapper.xml,interface 
