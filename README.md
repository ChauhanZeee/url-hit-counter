# url hit counter
## Frameworks and language used:
-  Spring Boot
-  Java
-  
## Data Flow


* **Model** :
  There are 0ne Model class in this application.

* **Controller** :
  There are one Controller class in this application.


**Functions/Endpoints used in User Controller Class.**
- To add User data :
- http://localhost:8080/api/v1/user/addUser


- To get all User's information:
- http://localhost:8080/api/v1/user/getAllUsers


- To update User's details:
- http://localhost:8080/api/v1/user/updateUser_details


- To delete User by id:
- http://localhost:8080/api/v1/user/deleteUser_with_user_id?user_id=2


- To get User by id:
- http://localhost:8080/api/v1/user/getUser_By_Id/2



**Functions/Endpoints used in Address Controller Class.**

- To add Address:
- http://localhost:8080/api/v1/address/addAddress


- To get all addresses associated with perticular User by user_id:
- http://localhost:8080/api/v1/address/get_all_addresses_of_user/2


- To get all addresses:
- http://localhost:8080/api/v1/address/getALl_addresses


- To get address by address_id:
- http://localhost:8080/api/v1/address/getAddres_By_address_id/2

**Functions/Endpoints used in Product Controller Class.**

- To add product:
- http://localhost:8080/api/v1/product/addProduct

- To get all products:
- http://localhost:8080/api/v1/product/getAll_products

- To delete product with product_id:
- http://localhost:8080/api/v1/product/deleteProduct_with_product_id/1

- To update product details:
- http://localhost:8080/api/v1/product/update_product_details

- To get product with product_id
- http://localhost:8080/api/v1/product/getProduct_By_product_id/1

- To get products of desires category:
- http://localhost:8080/api/v1/product/getProduct_based_on_category?category=XUV


