
package es.gbpa.mutalyzerWSClient;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ElementTranscriptInfoByNM
    extends JAXBElement<TranscriptInfoByNM>
{

    protected final static QName NAME = new QName("http://mutalyzer.nl/2.0/services", "transcriptInfo");

    public ElementTranscriptInfoByNM(TranscriptInfoByNM value) {
        super(NAME, ((Class) TranscriptInfoByNM.class), null, value);
    }

    public ElementTranscriptInfoByNM() {
        super(NAME, ((Class) TranscriptInfoByNM.class), null, null);
    }

}
