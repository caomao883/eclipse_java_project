

1将需要依赖一起打包
1.1第一个编写assembly.xml打包文件
1.2在pom.xml配置
<properties>
<maven.build.timestamp.format>yyyyMMdd</maven.build.timestamp.format>
</properties>
<plugin>  
		            <groupId>org.apache.maven.plugins</groupId>  
		            <artifactId>maven-assembly-plugin</artifactId>  
		            <version>2.6</version>
		            <configuration>
		            	<appendAssemblyId>false</appendAssemblyId>
		            	<finalName>study_java-${maven.build.timestamp}</finalName>
		                <descriptors>  
		                    <descriptor>src/main/assembly/assembly.xml</descriptor>  
		                </descriptors>  
		            </configuration>  
		            <executions>  
		                <execution>  
		                    <id>make-assembly</id> 
		                    <phase>package</phase>  
		                    <goals>  
		                        <goal>single</goal>  
		                    </goals>  
		                </execution>  
		            </executions>  
		        </plugin>

1.3 打包的时候，as run -->Run Configurations... ->gloads:package assembly:assembly


2 添加依赖
<dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.25</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12 -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
            <version>1.7.25</version>
            <!-- <scope>test</scope> -->
        </dependency>

3.参考PrintLog.java打印日志