# compiler project 
## main query:
            select substr(name,1,1) firstchar, 
            count(*), AVG(LEN(name)) 
            from users
            Group by substr(name,1,1)
            Order bt 1;
            
            select age,sum(salary) from users
            group by age;
###tasks: 
1. substr(string,int,int)
2. count(*)
3. AVG(INT)
4. LEN(String)
5. Group by <STRING, INT>
6. Order by <1,a>
7. sum(INT)

###todos:
1. RESULT header
2. display the execution plan
3. test the avg 
4. build the functions like subStr() and LEN()..
5. finish all aggregation function
