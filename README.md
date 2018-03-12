Startup the cloud required components as below:

1) cd /config and run mvn spring-boot:run, after doing this the spring cloud config server is up.
2) cd /registry and run the same command to start up the eureka server
3) cd /gateway and run the command, with this the apis will have the gateway to route with load balanced requests.

Tips:
1) jerry.wernerds.net is the server address, need to change to fit yours in /config/.../resources/share/application.yml
2) jerry.wernerds.net:8761 to view the eureka UI
