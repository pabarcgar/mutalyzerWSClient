package org.gbpa.mutalyzer.webservice;

import org.junit.Test;

/**
 * Created by parce on 5/13/14.
 */
public class MutalyzerTest {

    MutalyzerService mutalyzerService = new MutalyzerService();
    Mutalyzer mutalyzer = mutalyzerService.getMutalyzer();

    // TODO: implement setup method with pre annotation

    @Test
    public void testCheckSyntax() throws Exception {
        System.out.println("Syntax valid: " + mutalyzer.checkSyntax("NC_000001.9:g.1625195G>A").isValid());
    }

    @Test
    public void testGetchromName() throws Exception {
        System.out.println("Name: " + mutalyzer.getchromName("hg18", "NC_000001.9"));
    }

    @Test
    public void testChromosomeName() throws Exception {
        System.out.println("Cromosoma: " + mutalyzer.chromosomeName("hg18", "NC_000001.9"));
    }

    @Test
    public void numberConversion() throws Exception {
        System.out.println("Conversion: " + mutalyzer.numberConversion("hg18", "NC_000001.9:g.1625195G>A", null).getString());
        System.out.println("Conversion: " + mutalyzer.numberConversion("hg18", "NM_024011.2:c.1839C>T", null).getString());
        System.out.println("Conversion: " + mutalyzer.numberConversion("hg19", "NM_024011.2:c.1839C>T", null).getString());
    }
}
