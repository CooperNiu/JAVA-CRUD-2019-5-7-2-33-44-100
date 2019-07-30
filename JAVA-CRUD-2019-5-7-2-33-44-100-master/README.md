## 使用Postman测试本地API

### 练习描述
- 在`com.employee.crud`中完成Employee的**CRUD**(增删改查)四个接口的实现,并使用Postman测试本地API
- 要求接口路径为`http://localhost:8080/employees`,其GET方法查询到的Employee数据如下所示：

```
[
    {
        "id": 0,
        "name": "小明",
        "age": 20,
        "gender": "男"
    },
    {
        "id": 1,
        "name": "小红",
        "age": 19,
        "gender": "女"
    },
    {
        "id": 2,
        "name": "小智",
        "age": 15,
        "gender": "男"
    },
    {
        "id": 3,
        "name": "小钢",
        "age": 16,
        "gender": "女"
    },
    {
        "id": 4,
        "name": "小夏",
        "age": 15,
        "gender": "女"
    }
]

```

### 环境描述
- java8
- Intellij-IDEA

### 如何开始
- 克隆模版库
- 启动项目，若出现 Tomcat started on port(s): 8080 (http) 字样，说明项目启动成功

### 输出规范
- 项目根目录下创建result文件，其中包含对本地API增删改查四个接口测试的所有Postman截图