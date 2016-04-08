#J2EE Basics

## What is context-root
`
http://192.168.1.1:8080/mywebapp/index.html
`
- ipaddress and port to identify server host
- context-root is isolates application running in same server

## How J2EE folder structure works
`
mywebapp/
├── index.html
├── META-INF
└── WEB-INF
    ├── classes
    ├── lib
    └── web.xml
`
- mywebapp is project name
- It is context root as well
