# CI-the-two-minute-example-jenkins-fitnesse
Continuous Integration: Med jenkins och fitnesse. Anammar två-minutersexemplet som fitnesse har, sedan integrerar man det med Jenkins.
## Introduktion  
Det finns två mappar, den ena innehållande det som krävs för att köra igång en Jenkins byggserver. Den andra innehåller ett Javaprojekt som har ett enkelt program med enhetstester och Fitnessetester. 

### Jenkins  
**localhost:8080**  
**Användarnamn**: admin  
**Lösenord**: admin  
### Fitnesse
För att köra Fitnesse manuellt: Traversera till jenkinsfitnesse-katalogen.  
Skriv därefter in kommandot: **mvn verify -P auto** 
