Mutalyzer WS Java Client
========================

This package is a java client for Mutalyzer WebService (WSDL description: https://mutalyzer.nl/services/?wsdl)
This client works for Mutalyzer 2.0.3 version, released on 20 Oct 2014

How I have made this client?
----------------------------
I Have used java tools wsimport to create this client:

$ $JAVA_HOME/bin/wsimport -keep -verbose -p es.gbpa.mutalyzerWS https://mutalyzer.nl/services/?wsdl

There is a problem. This command will fail because there is a complexType named 'transcriptInfo' and another one named 'TranscriptInfo'. wsimport creates a class to represent 'transcriptInfo' type and names it 'TranscriptInfo', to follow Java conventions. This causes a conflict, because wsimport is trying to create two classes with the same name in the same package. To solve it:

- download wdsl:
$ wget https://mutalyzer.nl/services/?wsdl

- Rename downloaded file:
$ mv index.html?wsdl schema.wsdl

- Rename in the wdsl file 'TranscriptInfo' complex type to 'TranscriptInformation' to avoid conflicts:
$ sed -i  's/TranscriptInfo"/TranscriptInformation"/g' schema.wsdl

- Executes again wsimport using the schema.wdsl file, and now it will work fine
$ $JAVA_HOME/bin/wsimport -keep -verbose -p es.gbpa.mutalyzerWSClient schema.wsdl

- A new dir 'es/gbpa/mutalyzerWSClient' should have been created, containing .java and .class files of the WS Client

How to use this client?
-----------------------
You can find some examples in the test file './src/test/java/es/gbpa/mutalyzerWSClient/MutalyzerTest.java'. The full list of available operations is detailed in the Mutalyzer API documentation web: https://mutalyzer.nl/soap-api
