#! /bin/bash

curl democlient:demosecret@localhost:8080/oauth/token -d grant_type=password -d username=demouser -d password=demopassword -d scope=read
