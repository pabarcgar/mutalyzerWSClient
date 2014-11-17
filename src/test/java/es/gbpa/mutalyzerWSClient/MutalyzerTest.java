package es.gbpa.mutalyzerWSClient;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by parce on 5/13/14.
 */
public class MutalyzerTest {

    MutalyzerService mutalyzerService = new MutalyzerService();
    Mutalyzer mutalyzer = mutalyzerService.getMutalyzer();

    // TODO: implement setup method with pre annotation

    @Test
    public void testCheckSyntax() throws Exception {
        assertTrue(mutalyzer.checkSyntax("NC_000001.9:g.1625195G>A").isValid());
        assertFalse(mutalyzer.checkSyntax("NC_000001.9:g.1625195G>").isValid());
    }

    @Test
    public void testChromosomeName() throws Exception {
        assertEquals("chr1", mutalyzer.chromosomeName("hg18", "NC_000001.9"));
    }

    @Test
    public void numberConversion() throws Exception {
        assertEquals("[NC_000001.9:g.1625195G>A]", mutalyzer.numberConversion("hg18", "NM_024011.2:c.1839C>T", null).getString().toString());
        assertEquals("[NC_000001.10:g.1635335G>A]", mutalyzer.numberConversion("hg19", "NM_024011.2:c.1839C>T", null).getString().toString());
    }
}
