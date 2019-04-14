# compiler project 
## main query:
            select substr(name,1,1) firstchar, 
            count(*), AVG(LEN(name)) 
            from users
            Group by substr(name,1,1)
            Order bt 1 
###tasks: 
1. substr(string,int,int)
2. count(*)
3. AVG(INT)
4. LEN(INT)
5. Group by <STRING, INT>
6. Order by <1,a>
7. sum(INT)
