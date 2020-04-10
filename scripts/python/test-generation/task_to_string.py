from sys import argv
import json

tool=argv[1]
execution_id=argv[2]
project=argv[3]
caller_class=argv[4]
callee_class=argv[5]



data = {
        'tool': tool,
        'execution_id': execution_id,
        'project': project,
        'caller_class': caller_class,
        'callee_class': callee_class
        }


read_json =  json.dumps(data)
print read_json.replace(",", "|")
