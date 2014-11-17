Mutalyzer WS Java Client
========================

This package is a java client for Mutalyzer WebService:

[ Wildeman M, van Ophuizen E, den Dunnen JT, Taschner PE. Improving sequence variant descriptions in mutation databases and literature using the MUTALYZER sequence variation nomenclature checker. ​Hum Mutat 29:6-13 (2008)​(PMID: 18000842). ]

You can see the WebService WSDL description here: https://mutalyzer.nl/services/?wsdl

This client works for Mutalyzer 2.0.3 version, released on 20 Oct 2014

How I have made this client?
----------------------------
I Have used java tools wsimport to create this client:

$ $JAVA_HOME/bin/wsimport -keep -verbose -p es.gbpa.mutalyzerWS https://mutalyzer.nl/services/?wsdl

There is a problem. This command will fail because there is a complexType named 'transcriptInfo' and another one named 'TranscriptInfo'. wsimport creates a class to represent 'transcriptInfo' type and names it 'TranscriptInfo', to follow Java conventions. This causes a conflict, because wsimport is trying to create two classes with the same name in the same package. To solve it, we can use the name customization file included in this project:

$ JAVA_HOME/bin/wsimport -b nameCustomizations.xml -keep -verbose -p es.gbpa.mutalyzerWSClient https://mutalyzer.nl/services/?wsdl

- A new dir 'es/gbpa/mutalyzerWSClient' should have been created, containing .java and .class files of the WS Client

How to use this client?
-----------------------
You can find some examples in the test file './src/test/java/es/gbpa/mutalyzerWSClient/MutalyzerTest.java'. The full list of available operations is detailed in the Mutalyzer API documentation web: https://mutalyzer.nl/soap-api
