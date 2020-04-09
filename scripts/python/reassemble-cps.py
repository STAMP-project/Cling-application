from sys import argv

cp_entries=argv[1]
case=argv[2]

arr=cp_entries.split(":")

result=""
for ent in arr:
    if ent.startswith("defects4j"):
        result=result+":"+ent
    else:
        result=result+":projects/"+case+"/"+ent


print(result[1:])
