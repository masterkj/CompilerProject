# compiler project 
## current tasks 
1. fix our dataType and global array **(done)**
2. make use to the JSON file
    - declare CLEAR(); method in user_defined_method rule -> clear DT
    - update(); and load(); functions
3. fix our symbol table to store pair of: <dataType(string), item> **(done)**
    - we will reefer to a real data type in the symbol table **(done)**
    - we will notice the deference between the imperative and the Tables (Variable in just one attribute) to can easily get,update their values **(done)**
4. fix the AST to prepare start in codeGen
    - fix symbol table and table **(done)**
    - add to the variable the delimiter and the HDFS_PATH
5. do the create statement
6. we will add the c++ rules **(done)**
7. do all the semantic check requirements 
8. do the state report to Mr.Shikha 

##Asked questions 
1. should we handle Table inside a Table (DT inside DT) ?