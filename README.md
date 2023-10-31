# Proyecto: test - nisum


## Swagger
* Link a la documentación con Swagger: http://localhost:8080/swagger-ui/index.html




## API Reference



#### Create user

```http
  GET http://localhost:8080/registrer

```

#### Request
```
{
  "email": "ntorres12@icloud.com",
  "is_active": true,
  "name": "Juan",
  "password": "nTorres.12#$",
  "phones": [
    {
      "citycode": 2,
      "contrycode": 57,
      "number": 3014616667
    }
  ]
}
```

#### Response 
```

{
  "name": "Juan",
  "email": "ntorres12@icloud.com",
  "password": "nTorres.12#$",
  "created": "2023-10-31T13:18:46.715+00:00",
  "modified": "2023-10-31T13:18:46.715+00:00",
  "last_login": "2023-10-31T13:18:46.715+00:00",
  "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJudG9ycmVzMTJAaWNsb3VkLmNvbSIsImV4cCI6MTY5ODgxMjMyNiwiaWF0IjoxNjk4NzU4MzI2fQ.zZMgtZgIiJ-6NhkieojyJdvHfhl5OXdwr5HxBYf2Xr2VJAP9C-6xWkvc7btgpynFLyo5ExrGKax2rLQ3uCftCw",
  "is_active": true,
  "phones": [
    {
      "number": 3014616667,
      "citycode": 2,
      "contrycode": 57,
      "user_id": 0
    }
  ]
}
```

#### Get all users

```http
  GET http://localhost:8080/user

```

No parameters


#### Response
```
[
  {
    "name": "Nelson",
    "email": "nelsonperlaza@gmailcom",
    "password": null,
    "created": null,
    "modified": null,
    "last_login": "2023-10-31T13:17:53.151+00:00",
    "token": null,
    "is_active": null,
    "phones": []
  },
  {
    "name": "Juan",
    "email": "ntorres12@icloud.com",
    "password": "nTorres.12#$",
    "created": "2023-10-31T13:18:46.715+00:00",
    "modified": "2023-10-31T13:18:46.715+00:00",
    "last_login": "2023-10-31T13:18:46.715+00:00",
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJudG9ycmVzMTJAaWNsb3VkLmNvbSIsImV4cCI6MTY5ODgxMjMyNiwiaWF0IjoxNjk4NzU4MzI2fQ.zZMgtZgIiJ-6NhkieojyJdvHfhl5OXdwr5HxBYf2Xr2VJAP9C-6xWkvc7btgpynFLyo5ExrGKax2rLQ3uCftCw",
    "is_active": true,
    "phones": [
      {
        "number": 3014616667,
        "citycode": 2,
        "contrycode": 57,
        "user_id": 0
      }
    ]
  }
]

```






#### Update user

```http
  GET http://localhost:8080/registrer

```

#### Request
```
{
  "id": 2,
  "email": "ntorres@icloud.com",
  "is_active": true,
  "name": "Juan",
  "password": "nTorres.12#$",
  "phones": [
    {
      "citycode": 2,
      "contrycode": 57,
      "number": 3014616667
    }
  ]
}
```

#### Response 
```

{
  "name": "Juan",
  "email": "ntorres@icloud.com",
  "password": "nTorres.12#$",
  "created": null,
  "modified": null,
  "last_login": null,
  "token": null,
  "is_active": true,
  "phones": [
    {
      "number": 3014616667,
      "citycode": 2,
      "contrycode": 57,
      "user_id": 0
    }
  ]
}
```



#### Get item

```http
  GET http://localhost:8080/user/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

```
{
  "name": "Juan",
  "email": "ntorres@icloud.com",
  "password": "nTorres.12#$",
  "created": null,
  "modified": null,
  "last_login": null,
  "token": null,
  "is_active": true,
  "phones": [
    {
      "number": 3014616667,
      "citycode": 2,
      "contrycode": 57,
      "user_id": 0
    }
  ]
}
```



#### Delete user

```http
  DELETE http://localhost:8080/user/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

```
{
  "status": "Success",
  "message": "User 2 deleted"
}
```
