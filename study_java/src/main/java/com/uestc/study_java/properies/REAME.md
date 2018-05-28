1.项目 右键 -->new Floder -> 选择resource目录，新建conf

2.Test，添加加载Properties


3.linux通过添加-D添加System.Properties java属性
获取看SystemProperies


属性分类：
https://www.cnblogs.com/xiaohu1218/p/7844068.html
2.内置属性(Maven预定义,用户可以直接使用)
3.POM属性(使用pom属性可以引用到pom.xml文件对应元素的值)
4.自定义属性(在pom.xml文件的<properties>标签下定义的Maven属性)
5.settings.xml文件属性(与pom属性同理,用户使用以settings.开头的属性引用settings.xml文件中的XML元素值)
6.Java系统属性(所有的Java系统属性都可以使用Maven属性引用)
1.环境变量属性(所有的环境变量都可以用以env.开头的Maven属性引用)