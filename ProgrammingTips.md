# JAVA

###### Q38

Use `StringBuffer` or `StringBuilder` if the string needs to be modified frequently.
`StringBuilder` is faster than `StringBuilder`. However, it is not thread-safe.

###### Q20

Remember to use **stack** for checking parentheses pairs.

###### Q221

This is a naive implementation. The space complexity can be further reduced.
`size[i][j]` records the maximum size of square that contains `[i][j]` as the bottom-left corner.

###### Q475

For each house, compare its distances with the currentHeater and the next one. If next heater is nearer, replace the current one with the next one. Pay attention to the boundary condition.
To sort an array, use in-place sort: `Arrays.sort()`.

# SQL

###### D177

SQL variables:

```mysql
DECLARE @<varName> <varType>    #define a variable
SET <varName>=<value>           #set value
```