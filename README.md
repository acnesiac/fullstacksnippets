# backendsnippets

https://github.com/claudiajs/example-projects#web-api
https://github.com/eugenp/tutorials



aws lambda create-function --function-name "hello1" --runtime "nodejs6.10" --role "arn:aws:iam::938210480070:role/lambda_basic_execution" --handler "app/index.handler" --zip-file "fileb://c:/Users/a289431/app.zip" --region "us-east-1"



aws dynamodb create-table --table-name dynamo-test --attribute-definitions AttributeName=userid,AttributeType=S --key-schema AttributeName=userid,KeyType=HASH  --provisioned-throughput ReadCapacityUnits=1,WriteCapacityUnits=1   --query TableDescription.TableArn --output text
  


