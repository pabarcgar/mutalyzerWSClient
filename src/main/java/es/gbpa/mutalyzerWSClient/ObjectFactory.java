
package es.gbpa.mutalyzerWSClient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.gbpa.mutalyzerWSClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTranscriptsByGeneName_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsByGeneName");
    private final static QName _GetTranscriptsAndInfo_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsAndInfo");
    private final static QName _GetTranscriptsByGeneNameResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsByGeneNameResponse");
    private final static QName _MappingInfo_QNAME = new QName("http://mutalyzer.nl/2.0/services", "mappingInfo");
    private final static QName _NumberConversionResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "numberConversionResponse");
    private final static QName _UploadGenBankRemoteFileResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "uploadGenBankRemoteFileResponse");
    private final static QName _Transcript_QNAME = new QName("http://mutalyzer.nl/2.0/services", "Transcript");
    private final static QName _RunMutalyzerResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "runMutalyzerResponse");
    private final static QName _RawVariantArray_QNAME = new QName("http://mutalyzer.nl/2.0/services", "RawVariantArray");
    private final static QName _ChromosomeNameResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromosomeNameResponse");
    private final static QName _TranscriptInfoArray_QNAME = new QName("http://mutalyzer.nl/2.0/services", "TranscriptInfoArray");
    private final static QName _StringArray_QNAME = new QName("http://mutalyzer.nl/2.0/services", "stringArray");
    private final static QName _Info_QNAME = new QName("http://mutalyzer.nl/2.0/services", "info");
    private final static QName _ChromAccessionResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromAccessionResponse");
    private final static QName _GetTranscriptsAndInfoResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsAndInfoResponse");
    private final static QName _GetdbSNPDescriptions_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getdbSNPDescriptions");
    private final static QName _InfoOutput_QNAME = new QName("http://mutalyzer.nl/2.0/services", "InfoOutput");
    private final static QName _CheckSyntax_QNAME = new QName("http://mutalyzer.nl/2.0/services", "checkSyntax");
    private final static QName _GetGeneAndTranscript_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getGeneAndTranscript");
    private final static QName _Ping_QNAME = new QName("http://mutalyzer.nl/2.0/services", "ping");
    private final static QName _ChromAccession_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromAccession");
    private final static QName _UploadGenBankLocalFile_QNAME = new QName("http://mutalyzer.nl/2.0/services", "uploadGenBankLocalFile");
    private final static QName _CacheEntry_QNAME = new QName("http://mutalyzer.nl/2.0/services", "CacheEntry");
    private final static QName _Allele_QNAME = new QName("http://mutalyzer.nl/2.0/services", "Allele");
    private final static QName _ExonInfo_QNAME = new QName("http://mutalyzer.nl/2.0/services", "ExonInfo");
    private final static QName _TranscriptMappingInfoArray_QNAME = new QName("http://mutalyzer.nl/2.0/services", "TranscriptMappingInfoArray");
    private final static QName _RawVarArray_QNAME = new QName("http://mutalyzer.nl/2.0/services", "RawVarArray");
    private final static QName _SoapMessage_QNAME = new QName("http://mutalyzer.nl/2.0/services", "SoapMessage");
    private final static QName _MonitorBatchJob_QNAME = new QName("http://mutalyzer.nl/2.0/services", "monitorBatchJob");
    private final static QName _SliceChromosomeByGene_QNAME = new QName("http://mutalyzer.nl/2.0/services", "sliceChromosomeByGene");
    private final static QName _SliceChromosomeByGeneResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "sliceChromosomeByGeneResponse");
    private final static QName _GetTranscriptsRange_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsRange");
    private final static QName _SliceChromosomeResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "sliceChromosomeResponse");
    private final static QName _GetdbSNPDescriptionsResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getdbSNPDescriptionsResponse");
    private final static QName _RawVariant_QNAME = new QName("http://mutalyzer.nl/2.0/services", "RawVariant");
    private final static QName _GetGeneNameResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getGeneNameResponse");
    private final static QName _GetchromName_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getchromName");
    private final static QName _TranscriptMappingInfo_QNAME = new QName("http://mutalyzer.nl/2.0/services", "TranscriptMappingInfo");
    private final static QName _CheckSyntaxOutput_QNAME = new QName("http://mutalyzer.nl/2.0/services", "CheckSyntaxOutput");
    private final static QName _DescribeRawVar_QNAME = new QName("http://mutalyzer.nl/2.0/services", "DescribeRawVar");
    private final static QName _SubmitBatchJobResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "submitBatchJobResponse");
    private final static QName _MutalyzerOutput_QNAME = new QName("http://mutalyzer.nl/2.0/services", "MutalyzerOutput");
    private final static QName _GetTranscriptsMapping_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsMapping");
    private final static QName _SubmitBatchJob_QNAME = new QName("http://mutalyzer.nl/2.0/services", "submitBatchJob");
    private final static QName _GetGeneAndTranscriptResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getGeneAndTranscriptResponse");
    private final static QName _SliceChromosome_QNAME = new QName("http://mutalyzer.nl/2.0/services", "sliceChromosome");
    private final static QName _GetBatchJobResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getBatchJobResponse");
    private final static QName _ChromosomeName_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromosomeName");
    private final static QName _GetTranscripts_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscripts");
    private final static QName _GetchromNameResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getchromNameResponse");
    private final static QName _GetGeneName_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getGeneName");
    private final static QName _SoapMessageArray_QNAME = new QName("http://mutalyzer.nl/2.0/services", "SoapMessageArray");
    private final static QName _DescriptionExtractResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "descriptionExtractResponse");
    private final static QName _MonitorBatchJobResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "monitorBatchJobResponse");
    private final static QName _CheckSyntaxResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "checkSyntaxResponse");
    private final static QName _Mapping_QNAME = new QName("http://mutalyzer.nl/2.0/services", "Mapping");
    private final static QName _GetTranscriptsResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsResponse");
    private final static QName _GetCacheResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getCacheResponse");
    private final static QName _InfoResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "infoResponse");
    private final static QName _GetCache_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getCache");
    private final static QName _UploadGenBankRemoteFile_QNAME = new QName("http://mutalyzer.nl/2.0/services", "uploadGenBankRemoteFile");
    private final static QName _GetTranscriptsMappingResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsMappingResponse");
    private final static QName _UploadGenBankLocalFileResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "uploadGenBankLocalFileResponse");
    private final static QName _ProteinTranscript_QNAME = new QName("http://mutalyzer.nl/2.0/services", "ProteinTranscript");
    private final static QName _GetBatchJob_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getBatchJob");
    private final static QName _MappingInfoResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "mappingInfoResponse");
    private final static QName _RunMutalyzer_QNAME = new QName("http://mutalyzer.nl/2.0/services", "runMutalyzer");
    private final static QName _CacheEntryArray_QNAME = new QName("http://mutalyzer.nl/2.0/services", "CacheEntryArray");
    private final static QName _PingResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "pingResponse");
    private final static QName _DescriptionExtract_QNAME = new QName("http://mutalyzer.nl/2.0/services", "descriptionExtract");
    private final static QName _TranscriptNameInfo_QNAME = new QName("http://mutalyzer.nl/2.0/services", "TranscriptNameInfo");
    private final static QName _TranscriptInfoResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "transcriptInfoResponse");
    private final static QName _GetTranscriptsRangeResponse_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsRangeResponse");
    private final static QName _ExonInfoArray_QNAME = new QName("http://mutalyzer.nl/2.0/services", "ExonInfoArray");
    private final static QName _NumberConversion_QNAME = new QName("http://mutalyzer.nl/2.0/services", "numberConversion");
    private final static QName _RawVar_QNAME = new QName("http://mutalyzer.nl/2.0/services", "RawVar");
    private final static QName _TranscriptInfo_QNAME = new QName("http://mutalyzer.nl/2.0/services", "TranscriptInfo");
    private final static QName _GetCacheCreatedSince_QNAME = new QName("http://mutalyzer.nl/2.0/services", "created_since");
    private final static QName _NumberConversionResponseNumberConversionResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "numberConversionResult");
    private final static QName _SubmitBatchJobResponseSubmitBatchJobResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "submitBatchJobResult");
    private final static QName _GetTranscriptsVersions_QNAME = new QName("http://mutalyzer.nl/2.0/services", "versions");
    private final static QName _GetTranscriptsMappingResponseGetTranscriptsMappingResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsMappingResult");
    private final static QName _GetTranscriptsRangeResponseGetTranscriptsRangeResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsRangeResult");
    private final static QName _CheckSyntaxResponseCheckSyntaxResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "checkSyntaxResult");
    private final static QName _InfoOutputReleaseDate_QNAME = new QName("http://mutalyzer.nl/2.0/services", "releaseDate");
    private final static QName _InfoOutputAnnouncement_QNAME = new QName("http://mutalyzer.nl/2.0/services", "announcement");
    private final static QName _InfoOutputAnnouncementUrl_QNAME = new QName("http://mutalyzer.nl/2.0/services", "announcementUrl");
    private final static QName _InfoOutputNomenclatureVersion_QNAME = new QName("http://mutalyzer.nl/2.0/services", "nomenclatureVersion");
    private final static QName _InfoOutputVersionParts_QNAME = new QName("http://mutalyzer.nl/2.0/services", "versionParts");
    private final static QName _InfoOutputContactEmail_QNAME = new QName("http://mutalyzer.nl/2.0/services", "contactEmail");
    private final static QName _InfoOutputNomenclatureVersionParts_QNAME = new QName("http://mutalyzer.nl/2.0/services", "nomenclatureVersionParts");
    private final static QName _InfoOutputVersion_QNAME = new QName("http://mutalyzer.nl/2.0/services", "version");
    private final static QName _InfoOutputServerName_QNAME = new QName("http://mutalyzer.nl/2.0/services", "serverName");
    private final static QName _GetdbSNPDescriptionsResponseGetdbSNPDescriptionsResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getdbSNPDescriptionsResult");
    private final static QName _GetTranscriptsAndInfoGeneName_QNAME = new QName("http://mutalyzer.nl/2.0/services", "geneName");
    private final static QName _MappingEndmain_QNAME = new QName("http://mutalyzer.nl/2.0/services", "endmain");
    private final static QName _MappingStartmain_QNAME = new QName("http://mutalyzer.nl/2.0/services", "startmain");
    private final static QName _MappingEndoffset_QNAME = new QName("http://mutalyzer.nl/2.0/services", "endoffset");
    private final static QName _MappingErrorcode_QNAME = new QName("http://mutalyzer.nl/2.0/services", "errorcode");
    private final static QName _MappingEndG_QNAME = new QName("http://mutalyzer.nl/2.0/services", "end_g");
    private final static QName _MappingMutationType_QNAME = new QName("http://mutalyzer.nl/2.0/services", "mutationType");
    private final static QName _MappingMessages_QNAME = new QName("http://mutalyzer.nl/2.0/services", "messages");
    private final static QName _MappingStartG_QNAME = new QName("http://mutalyzer.nl/2.0/services", "start_g");
    private final static QName _MappingStartoffset_QNAME = new QName("http://mutalyzer.nl/2.0/services", "startoffset");
    private final static QName _InfoResponseInfoResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "infoResult");
    private final static QName _ExonInfoChromStart_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromStart");
    private final static QName _ExonInfoChromStop_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromStop");
    private final static QName _NumberConversionGene_QNAME = new QName("http://mutalyzer.nl/2.0/services", "gene");
    private final static QName _GetBatchJobResponseGetBatchJobResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getBatchJobResult");
    private final static QName _MappingInfoResponseMappingInfoResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "mappingInfoResult");
    private final static QName _RunMutalyzerResponseRunMutalyzerResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "runMutalyzerResult");
    private final static QName _GetTranscriptsByGeneNameResponseGetTranscriptsByGeneNameResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsByGeneNameResult");
    private final static QName _AlleleAllele_QNAME = new QName("http://mutalyzer.nl/2.0/services", "allele");
    private final static QName _SubmitBatchJobArgument_QNAME = new QName("http://mutalyzer.nl/2.0/services", "argument");
    private final static QName _SubmitBatchJobProcess_QNAME = new QName("http://mutalyzer.nl/2.0/services", "process");
    private final static QName _MonitorBatchJobResponseMonitorBatchJobResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "monitorBatchJobResult");
    private final static QName _TranscriptTransStop_QNAME = new QName("http://mutalyzer.nl/2.0/services", "trans_stop");
    private final static QName _TranscriptCDSStop_QNAME = new QName("http://mutalyzer.nl/2.0/services", "CDS_stop");
    private final static QName _TranscriptTransStart_QNAME = new QName("http://mutalyzer.nl/2.0/services", "trans_start");
    private final static QName _MutalyzerOutputNewProtein_QNAME = new QName("http://mutalyzer.nl/2.0/services", "newProtein");
    private final static QName _MutalyzerOutputTranscriptDescriptions_QNAME = new QName("http://mutalyzer.nl/2.0/services", "transcriptDescriptions");
    private final static QName _MutalyzerOutputSummary_QNAME = new QName("http://mutalyzer.nl/2.0/services", "summary");
    private final static QName _MutalyzerOutputMutatedMRNA_QNAME = new QName("http://mutalyzer.nl/2.0/services", "mutatedMRNA");
    private final static QName _MutalyzerOutputOrigProtein_QNAME = new QName("http://mutalyzer.nl/2.0/services", "origProtein");
    private final static QName _MutalyzerOutputProteinDescriptions_QNAME = new QName("http://mutalyzer.nl/2.0/services", "proteinDescriptions");
    private final static QName _MutalyzerOutputGenomicDescription_QNAME = new QName("http://mutalyzer.nl/2.0/services", "genomicDescription");
    private final static QName _MutalyzerOutputRawVariants_QNAME = new QName("http://mutalyzer.nl/2.0/services", "rawVariants");
    private final static QName _MutalyzerOutputSourceGi_QNAME = new QName("http://mutalyzer.nl/2.0/services", "sourceGi");
    private final static QName _MutalyzerOutputOrigMRNA_QNAME = new QName("http://mutalyzer.nl/2.0/services", "origMRNA");
    private final static QName _MutalyzerOutputErrors_QNAME = new QName("http://mutalyzer.nl/2.0/services", "errors");
    private final static QName _MutalyzerOutputExons_QNAME = new QName("http://mutalyzer.nl/2.0/services", "exons");
    private final static QName _MutalyzerOutputSourceVersion_QNAME = new QName("http://mutalyzer.nl/2.0/services", "sourceVersion");
    private final static QName _MutalyzerOutputNewCDS_QNAME = new QName("http://mutalyzer.nl/2.0/services", "newCDS");
    private final static QName _MutalyzerOutputOriginal_QNAME = new QName("http://mutalyzer.nl/2.0/services", "original");
    private final static QName _MutalyzerOutputChromDescription_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromDescription");
    private final static QName _MutalyzerOutputSourceAccession_QNAME = new QName("http://mutalyzer.nl/2.0/services", "sourceAccession");
    private final static QName _MutalyzerOutputMutated_QNAME = new QName("http://mutalyzer.nl/2.0/services", "mutated");
    private final static QName _MutalyzerOutputOrigCDS_QNAME = new QName("http://mutalyzer.nl/2.0/services", "origCDS");
    private final static QName _MutalyzerOutputAltProtein_QNAME = new QName("http://mutalyzer.nl/2.0/services", "altProtein");
    private final static QName _MutalyzerOutputWarnings_QNAME = new QName("http://mutalyzer.nl/2.0/services", "warnings");
    private final static QName _DescriptionExtractResponseDescriptionExtractResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "descriptionExtractResult");
    private final static QName _GetTranscriptsAndInfoResponseGetTranscriptsAndInfoResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsAndInfoResult");
    private final static QName _GetCacheResponseGetCacheResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getCacheResult");
    private final static QName _TranscriptInfoResponseTranscriptInfoResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "transcriptInfoResult");
    private final static QName _GetGeneAndTranscriptResponseGetGeneAndTranscriptResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getGeneAndTranscriptResult");
    private final static QName _GetTranscriptsResponseGetTranscriptsResult_QNAME = new QName("http://mutalyzer.nl/2.0/services", "getTranscriptsResult");
    private final static QName _CacheEntryCached_QNAME = new QName("http://mutalyzer.nl/2.0/services", "cached");
    private final static QName _CacheEntryChromosomeStart_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromosomeStart");
    private final static QName _CacheEntryGi_QNAME = new QName("http://mutalyzer.nl/2.0/services", "gi");
    private final static QName _CacheEntryChromosomeOrientation_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromosomeOrientation");
    private final static QName _CacheEntryChromosomeStop_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromosomeStop");
    private final static QName _CacheEntryUrl_QNAME = new QName("http://mutalyzer.nl/2.0/services", "url");
    private final static QName _TranscriptInfoChromCDSStart_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromCDSStart");
    private final static QName _TranscriptInfoProteinTranscript_QNAME = new QName("http://mutalyzer.nl/2.0/services", "proteinTranscript");
    private final static QName _TranscriptInfoChromTransStart_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromTransStart");
    private final static QName _TranscriptInfoChromCDSStop_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromCDSStop");
    private final static QName _TranscriptInfoChromTransEnd_QNAME = new QName("http://mutalyzer.nl/2.0/services", "chromTransEnd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.gbpa.mutalyzerWSClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTranscriptsByGeneNameResponse }
     * 
     */
    public GetTranscriptsByGeneNameResponse createGetTranscriptsByGeneNameResponse() {
        return new GetTranscriptsByGeneNameResponse();
    }

    /**
     * Create an instance of {@link MappingInfo }
     * 
     */
    public MappingInfo createMappingInfo() {
        return new MappingInfo();
    }

    /**
     * Create an instance of {@link GetTranscriptsAndInfo }
     * 
     */
    public GetTranscriptsAndInfo createGetTranscriptsAndInfo() {
        return new GetTranscriptsAndInfo();
    }

    /**
     * Create an instance of {@link GetTranscriptsByGeneName }
     * 
     */
    public GetTranscriptsByGeneName createGetTranscriptsByGeneName() {
        return new GetTranscriptsByGeneName();
    }

    /**
     * Create an instance of {@link RunMutalyzerResponse }
     * 
     */
    public RunMutalyzerResponse createRunMutalyzerResponse() {
        return new RunMutalyzerResponse();
    }

    /**
     * Create an instance of {@link RawVariantArray }
     * 
     */
    public RawVariantArray createRawVariantArray() {
        return new RawVariantArray();
    }

    /**
     * Create an instance of {@link UploadGenBankRemoteFileResponse }
     * 
     */
    public UploadGenBankRemoteFileResponse createUploadGenBankRemoteFileResponse() {
        return new UploadGenBankRemoteFileResponse();
    }

    /**
     * Create an instance of {@link Transcript }
     * 
     */
    public Transcript createTranscript() {
        return new Transcript();
    }

    /**
     * Create an instance of {@link NumberConversionResponse }
     * 
     */
    public NumberConversionResponse createNumberConversionResponse() {
        return new NumberConversionResponse();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link TranscriptInfoArray }
     * 
     */
    public TranscriptInfoArray createTranscriptInfoArray() {
        return new TranscriptInfoArray();
    }

    /**
     * Create an instance of {@link ChromosomeNameResponse }
     * 
     */
    public ChromosomeNameResponse createChromosomeNameResponse() {
        return new ChromosomeNameResponse();
    }

    /**
     * Create an instance of {@link ChromAccessionResponse }
     * 
     */
    public ChromAccessionResponse createChromAccessionResponse() {
        return new ChromAccessionResponse();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link GetdbSNPDescriptions }
     * 
     */
    public GetdbSNPDescriptions createGetdbSNPDescriptions() {
        return new GetdbSNPDescriptions();
    }

    /**
     * Create an instance of {@link GetTranscriptsAndInfoResponse }
     * 
     */
    public GetTranscriptsAndInfoResponse createGetTranscriptsAndInfoResponse() {
        return new GetTranscriptsAndInfoResponse();
    }

    /**
     * Create an instance of {@link CheckSyntax }
     * 
     */
    public CheckSyntax createCheckSyntax() {
        return new CheckSyntax();
    }

    /**
     * Create an instance of {@link InfoOutput }
     * 
     */
    public InfoOutput createInfoOutput() {
        return new InfoOutput();
    }

    /**
     * Create an instance of {@link UploadGenBankLocalFile }
     * 
     */
    public UploadGenBankLocalFile createUploadGenBankLocalFile() {
        return new UploadGenBankLocalFile();
    }

    /**
     * Create an instance of {@link ChromAccession }
     * 
     */
    public ChromAccession createChromAccession() {
        return new ChromAccession();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link GetGeneAndTranscript }
     * 
     */
    public GetGeneAndTranscript createGetGeneAndTranscript() {
        return new GetGeneAndTranscript();
    }

    /**
     * Create an instance of {@link ExonInfo }
     * 
     */
    public ExonInfo createExonInfo() {
        return new ExonInfo();
    }

    /**
     * Create an instance of {@link Allele }
     * 
     */
    public Allele createAllele() {
        return new Allele();
    }

    /**
     * Create an instance of {@link CacheEntry }
     * 
     */
    public CacheEntry createCacheEntry() {
        return new CacheEntry();
    }

    /**
     * Create an instance of {@link TranscriptMappingInfoArray }
     * 
     */
    public TranscriptMappingInfoArray createTranscriptMappingInfoArray() {
        return new TranscriptMappingInfoArray();
    }

    /**
     * Create an instance of {@link MonitorBatchJob }
     * 
     */
    public MonitorBatchJob createMonitorBatchJob() {
        return new MonitorBatchJob();
    }

    /**
     * Create an instance of {@link RawVarArray }
     * 
     */
    public RawVarArray createRawVarArray() {
        return new RawVarArray();
    }

    /**
     * Create an instance of {@link SoapMessage }
     * 
     */
    public SoapMessage createSoapMessage() {
        return new SoapMessage();
    }

    /**
     * Create an instance of {@link TranscriptInfoByNM }
     * 
     */
    public TranscriptInfoByNM createTranscriptInfoByNM() {
        return new TranscriptInfoByNM();
    }

    /**
     * Create an instance of {@link SliceChromosomeByGeneResponse }
     * 
     */
    public SliceChromosomeByGeneResponse createSliceChromosomeByGeneResponse() {
        return new SliceChromosomeByGeneResponse();
    }

    /**
     * Create an instance of {@link SliceChromosomeByGene }
     * 
     */
    public SliceChromosomeByGene createSliceChromosomeByGene() {
        return new SliceChromosomeByGene();
    }

    /**
     * Create an instance of {@link GetdbSNPDescriptionsResponse }
     * 
     */
    public GetdbSNPDescriptionsResponse createGetdbSNPDescriptionsResponse() {
        return new GetdbSNPDescriptionsResponse();
    }

    /**
     * Create an instance of {@link SliceChromosomeResponse }
     * 
     */
    public SliceChromosomeResponse createSliceChromosomeResponse() {
        return new SliceChromosomeResponse();
    }

    /**
     * Create an instance of {@link GetTranscriptsRange }
     * 
     */
    public GetTranscriptsRange createGetTranscriptsRange() {
        return new GetTranscriptsRange();
    }

    /**
     * Create an instance of {@link GetGeneNameResponse }
     * 
     */
    public GetGeneNameResponse createGetGeneNameResponse() {
        return new GetGeneNameResponse();
    }

    /**
     * Create an instance of {@link RawVariant }
     * 
     */
    public RawVariant createRawVariant() {
        return new RawVariant();
    }

    /**
     * Create an instance of {@link SubmitBatchJobResponse }
     * 
     */
    public SubmitBatchJobResponse createSubmitBatchJobResponse() {
        return new SubmitBatchJobResponse();
    }

    /**
     * Create an instance of {@link DescribeRawVar }
     * 
     */
    public DescribeRawVar createDescribeRawVar() {
        return new DescribeRawVar();
    }

    /**
     * Create an instance of {@link TranscriptMappingInfo }
     * 
     */
    public TranscriptMappingInfo createTranscriptMappingInfo() {
        return new TranscriptMappingInfo();
    }

    /**
     * Create an instance of {@link CheckSyntaxOutput }
     * 
     */
    public CheckSyntaxOutput createCheckSyntaxOutput() {
        return new CheckSyntaxOutput();
    }

    /**
     * Create an instance of {@link GetchromName }
     * 
     */
    public GetchromName createGetchromName() {
        return new GetchromName();
    }

    /**
     * Create an instance of {@link MutalyzerOutput }
     * 
     */
    public MutalyzerOutput createMutalyzerOutput() {
        return new MutalyzerOutput();
    }

    /**
     * Create an instance of {@link SubmitBatchJob }
     * 
     */
    public SubmitBatchJob createSubmitBatchJob() {
        return new SubmitBatchJob();
    }

    /**
     * Create an instance of {@link GetTranscriptsMapping }
     * 
     */
    public GetTranscriptsMapping createGetTranscriptsMapping() {
        return new GetTranscriptsMapping();
    }

    /**
     * Create an instance of {@link GetBatchJobResponse }
     * 
     */
    public GetBatchJobResponse createGetBatchJobResponse() {
        return new GetBatchJobResponse();
    }

    /**
     * Create an instance of {@link GetGeneAndTranscriptResponse }
     * 
     */
    public GetGeneAndTranscriptResponse createGetGeneAndTranscriptResponse() {
        return new GetGeneAndTranscriptResponse();
    }

    /**
     * Create an instance of {@link SliceChromosome }
     * 
     */
    public SliceChromosome createSliceChromosome() {
        return new SliceChromosome();
    }

    /**
     * Create an instance of {@link GetGeneName }
     * 
     */
    public GetGeneName createGetGeneName() {
        return new GetGeneName();
    }

    /**
     * Create an instance of {@link GetchromNameResponse }
     * 
     */
    public GetchromNameResponse createGetchromNameResponse() {
        return new GetchromNameResponse();
    }

    /**
     * Create an instance of {@link GetTranscripts }
     * 
     */
    public GetTranscripts createGetTranscripts() {
        return new GetTranscripts();
    }

    /**
     * Create an instance of {@link ChromosomeName }
     * 
     */
    public ChromosomeName createChromosomeName() {
        return new ChromosomeName();
    }

    /**
     * Create an instance of {@link DescriptionExtractResponse }
     * 
     */
    public DescriptionExtractResponse createDescriptionExtractResponse() {
        return new DescriptionExtractResponse();
    }

    /**
     * Create an instance of {@link SoapMessageArray }
     * 
     */
    public SoapMessageArray createSoapMessageArray() {
        return new SoapMessageArray();
    }

    /**
     * Create an instance of {@link CheckSyntaxResponse }
     * 
     */
    public CheckSyntaxResponse createCheckSyntaxResponse() {
        return new CheckSyntaxResponse();
    }

    /**
     * Create an instance of {@link MonitorBatchJobResponse }
     * 
     */
    public MonitorBatchJobResponse createMonitorBatchJobResponse() {
        return new MonitorBatchJobResponse();
    }

    /**
     * Create an instance of {@link GetCacheResponse }
     * 
     */
    public GetCacheResponse createGetCacheResponse() {
        return new GetCacheResponse();
    }

    /**
     * Create an instance of {@link GetTranscriptsResponse }
     * 
     */
    public GetTranscriptsResponse createGetTranscriptsResponse() {
        return new GetTranscriptsResponse();
    }

    /**
     * Create an instance of {@link Mapping }
     * 
     */
    public Mapping createMapping() {
        return new Mapping();
    }

    /**
     * Create an instance of {@link GetCache }
     * 
     */
    public GetCache createGetCache() {
        return new GetCache();
    }

    /**
     * Create an instance of {@link InfoResponse }
     * 
     */
    public InfoResponse createInfoResponse() {
        return new InfoResponse();
    }

    /**
     * Create an instance of {@link UploadGenBankLocalFileResponse }
     * 
     */
    public UploadGenBankLocalFileResponse createUploadGenBankLocalFileResponse() {
        return new UploadGenBankLocalFileResponse();
    }

    /**
     * Create an instance of {@link GetTranscriptsMappingResponse }
     * 
     */
    public GetTranscriptsMappingResponse createGetTranscriptsMappingResponse() {
        return new GetTranscriptsMappingResponse();
    }

    /**
     * Create an instance of {@link UploadGenBankRemoteFile }
     * 
     */
    public UploadGenBankRemoteFile createUploadGenBankRemoteFile() {
        return new UploadGenBankRemoteFile();
    }

    /**
     * Create an instance of {@link CacheEntryArray }
     * 
     */
    public CacheEntryArray createCacheEntryArray() {
        return new CacheEntryArray();
    }

    /**
     * Create an instance of {@link RunMutalyzer }
     * 
     */
    public RunMutalyzer createRunMutalyzer() {
        return new RunMutalyzer();
    }

    /**
     * Create an instance of {@link MappingInfoResponse }
     * 
     */
    public MappingInfoResponse createMappingInfoResponse() {
        return new MappingInfoResponse();
    }

    /**
     * Create an instance of {@link GetBatchJob }
     * 
     */
    public GetBatchJob createGetBatchJob() {
        return new GetBatchJob();
    }

    /**
     * Create an instance of {@link ProteinTranscript }
     * 
     */
    public ProteinTranscript createProteinTranscript() {
        return new ProteinTranscript();
    }

    /**
     * Create an instance of {@link TranscriptInfoResponse }
     * 
     */
    public TranscriptInfoResponse createTranscriptInfoResponse() {
        return new TranscriptInfoResponse();
    }

    /**
     * Create an instance of {@link TranscriptNameInfo }
     * 
     */
    public TranscriptNameInfo createTranscriptNameInfo() {
        return new TranscriptNameInfo();
    }

    /**
     * Create an instance of {@link DescriptionExtract }
     * 
     */
    public DescriptionExtract createDescriptionExtract() {
        return new DescriptionExtract();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link ExonInfoArray }
     * 
     */
    public ExonInfoArray createExonInfoArray() {
        return new ExonInfoArray();
    }

    /**
     * Create an instance of {@link GetTranscriptsRangeResponse }
     * 
     */
    public GetTranscriptsRangeResponse createGetTranscriptsRangeResponse() {
        return new GetTranscriptsRangeResponse();
    }

    /**
     * Create an instance of {@link RawVar }
     * 
     */
    public RawVar createRawVar() {
        return new RawVar();
    }

    /**
     * Create an instance of {@link NumberConversion }
     * 
     */
    public NumberConversion createNumberConversion() {
        return new NumberConversion();
    }

    /**
     * Create an instance of {@link TranscriptInfo }
     * 
     */
    public TranscriptInfo createTranscriptInfo() {
        return new TranscriptInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscriptsByGeneName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsByGeneName")
    public JAXBElement<GetTranscriptsByGeneName> createGetTranscriptsByGeneName(GetTranscriptsByGeneName value) {
        return new JAXBElement<GetTranscriptsByGeneName>(_GetTranscriptsByGeneName_QNAME, GetTranscriptsByGeneName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscriptsAndInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsAndInfo")
    public JAXBElement<GetTranscriptsAndInfo> createGetTranscriptsAndInfo(GetTranscriptsAndInfo value) {
        return new JAXBElement<GetTranscriptsAndInfo>(_GetTranscriptsAndInfo_QNAME, GetTranscriptsAndInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscriptsByGeneNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsByGeneNameResponse")
    public JAXBElement<GetTranscriptsByGeneNameResponse> createGetTranscriptsByGeneNameResponse(GetTranscriptsByGeneNameResponse value) {
        return new JAXBElement<GetTranscriptsByGeneNameResponse>(_GetTranscriptsByGeneNameResponse_QNAME, GetTranscriptsByGeneNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "mappingInfo")
    public JAXBElement<MappingInfo> createMappingInfo(MappingInfo value) {
        return new JAXBElement<MappingInfo>(_MappingInfo_QNAME, MappingInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberConversionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "numberConversionResponse")
    public JAXBElement<NumberConversionResponse> createNumberConversionResponse(NumberConversionResponse value) {
        return new JAXBElement<NumberConversionResponse>(_NumberConversionResponse_QNAME, NumberConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadGenBankRemoteFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "uploadGenBankRemoteFileResponse")
    public JAXBElement<UploadGenBankRemoteFileResponse> createUploadGenBankRemoteFileResponse(UploadGenBankRemoteFileResponse value) {
        return new JAXBElement<UploadGenBankRemoteFileResponse>(_UploadGenBankRemoteFileResponse_QNAME, UploadGenBankRemoteFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transcript }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "Transcript")
    public JAXBElement<Transcript> createTranscript(Transcript value) {
        return new JAXBElement<Transcript>(_Transcript_QNAME, Transcript.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunMutalyzerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "runMutalyzerResponse")
    public JAXBElement<RunMutalyzerResponse> createRunMutalyzerResponse(RunMutalyzerResponse value) {
        return new JAXBElement<RunMutalyzerResponse>(_RunMutalyzerResponse_QNAME, RunMutalyzerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RawVariantArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "RawVariantArray")
    public JAXBElement<RawVariantArray> createRawVariantArray(RawVariantArray value) {
        return new JAXBElement<RawVariantArray>(_RawVariantArray_QNAME, RawVariantArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChromosomeNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromosomeNameResponse")
    public JAXBElement<ChromosomeNameResponse> createChromosomeNameResponse(ChromosomeNameResponse value) {
        return new JAXBElement<ChromosomeNameResponse>(_ChromosomeNameResponse_QNAME, ChromosomeNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranscriptInfoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "TranscriptInfoArray")
    public JAXBElement<TranscriptInfoArray> createTranscriptInfoArray(TranscriptInfoArray value) {
        return new JAXBElement<TranscriptInfoArray>(_TranscriptInfoArray_QNAME, TranscriptInfoArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "stringArray")
    public JAXBElement<StringArray> createStringArray(StringArray value) {
        return new JAXBElement<StringArray>(_StringArray_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Info }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "info")
    public JAXBElement<Info> createInfo(Info value) {
        return new JAXBElement<Info>(_Info_QNAME, Info.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChromAccessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromAccessionResponse")
    public JAXBElement<ChromAccessionResponse> createChromAccessionResponse(ChromAccessionResponse value) {
        return new JAXBElement<ChromAccessionResponse>(_ChromAccessionResponse_QNAME, ChromAccessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscriptsAndInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsAndInfoResponse")
    public JAXBElement<GetTranscriptsAndInfoResponse> createGetTranscriptsAndInfoResponse(GetTranscriptsAndInfoResponse value) {
        return new JAXBElement<GetTranscriptsAndInfoResponse>(_GetTranscriptsAndInfoResponse_QNAME, GetTranscriptsAndInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetdbSNPDescriptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getdbSNPDescriptions")
    public JAXBElement<GetdbSNPDescriptions> createGetdbSNPDescriptions(GetdbSNPDescriptions value) {
        return new JAXBElement<GetdbSNPDescriptions>(_GetdbSNPDescriptions_QNAME, GetdbSNPDescriptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "InfoOutput")
    public JAXBElement<InfoOutput> createInfoOutput(InfoOutput value) {
        return new JAXBElement<InfoOutput>(_InfoOutput_QNAME, InfoOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSyntax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "checkSyntax")
    public JAXBElement<CheckSyntax> createCheckSyntax(CheckSyntax value) {
        return new JAXBElement<CheckSyntax>(_CheckSyntax_QNAME, CheckSyntax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneAndTranscript }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getGeneAndTranscript")
    public JAXBElement<GetGeneAndTranscript> createGetGeneAndTranscript(GetGeneAndTranscript value) {
        return new JAXBElement<GetGeneAndTranscript>(_GetGeneAndTranscript_QNAME, GetGeneAndTranscript.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "ping")
    public JAXBElement<Ping> createPing(Ping value) {
        return new JAXBElement<Ping>(_Ping_QNAME, Ping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChromAccession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromAccession")
    public JAXBElement<ChromAccession> createChromAccession(ChromAccession value) {
        return new JAXBElement<ChromAccession>(_ChromAccession_QNAME, ChromAccession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadGenBankLocalFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "uploadGenBankLocalFile")
    public JAXBElement<UploadGenBankLocalFile> createUploadGenBankLocalFile(UploadGenBankLocalFile value) {
        return new JAXBElement<UploadGenBankLocalFile>(_UploadGenBankLocalFile_QNAME, UploadGenBankLocalFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacheEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "CacheEntry")
    public JAXBElement<CacheEntry> createCacheEntry(CacheEntry value) {
        return new JAXBElement<CacheEntry>(_CacheEntry_QNAME, CacheEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Allele }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "Allele")
    public JAXBElement<Allele> createAllele(Allele value) {
        return new JAXBElement<Allele>(_Allele_QNAME, Allele.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExonInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "ExonInfo")
    public JAXBElement<ExonInfo> createExonInfo(ExonInfo value) {
        return new JAXBElement<ExonInfo>(_ExonInfo_QNAME, ExonInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranscriptMappingInfoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "TranscriptMappingInfoArray")
    public JAXBElement<TranscriptMappingInfoArray> createTranscriptMappingInfoArray(TranscriptMappingInfoArray value) {
        return new JAXBElement<TranscriptMappingInfoArray>(_TranscriptMappingInfoArray_QNAME, TranscriptMappingInfoArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RawVarArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "RawVarArray")
    public JAXBElement<RawVarArray> createRawVarArray(RawVarArray value) {
        return new JAXBElement<RawVarArray>(_RawVarArray_QNAME, RawVarArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "SoapMessage")
    public JAXBElement<SoapMessage> createSoapMessage(SoapMessage value) {
        return new JAXBElement<SoapMessage>(_SoapMessage_QNAME, SoapMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitorBatchJob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "monitorBatchJob")
    public JAXBElement<MonitorBatchJob> createMonitorBatchJob(MonitorBatchJob value) {
        return new JAXBElement<MonitorBatchJob>(_MonitorBatchJob_QNAME, MonitorBatchJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SliceChromosomeByGene }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "sliceChromosomeByGene")
    public JAXBElement<SliceChromosomeByGene> createSliceChromosomeByGene(SliceChromosomeByGene value) {
        return new JAXBElement<SliceChromosomeByGene>(_SliceChromosomeByGene_QNAME, SliceChromosomeByGene.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SliceChromosomeByGeneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "sliceChromosomeByGeneResponse")
    public JAXBElement<SliceChromosomeByGeneResponse> createSliceChromosomeByGeneResponse(SliceChromosomeByGeneResponse value) {
        return new JAXBElement<SliceChromosomeByGeneResponse>(_SliceChromosomeByGeneResponse_QNAME, SliceChromosomeByGeneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link ElementTranscriptInfoByNM }}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "transcriptInfo")
    public ElementTranscriptInfoByNM createElementTranscriptInfoByNM(TranscriptInfoByNM value) {
        return new ElementTranscriptInfoByNM(value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscriptsRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsRange")
    public JAXBElement<GetTranscriptsRange> createGetTranscriptsRange(GetTranscriptsRange value) {
        return new JAXBElement<GetTranscriptsRange>(_GetTranscriptsRange_QNAME, GetTranscriptsRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SliceChromosomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "sliceChromosomeResponse")
    public JAXBElement<SliceChromosomeResponse> createSliceChromosomeResponse(SliceChromosomeResponse value) {
        return new JAXBElement<SliceChromosomeResponse>(_SliceChromosomeResponse_QNAME, SliceChromosomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetdbSNPDescriptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getdbSNPDescriptionsResponse")
    public JAXBElement<GetdbSNPDescriptionsResponse> createGetdbSNPDescriptionsResponse(GetdbSNPDescriptionsResponse value) {
        return new JAXBElement<GetdbSNPDescriptionsResponse>(_GetdbSNPDescriptionsResponse_QNAME, GetdbSNPDescriptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RawVariant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "RawVariant")
    public JAXBElement<RawVariant> createRawVariant(RawVariant value) {
        return new JAXBElement<RawVariant>(_RawVariant_QNAME, RawVariant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getGeneNameResponse")
    public JAXBElement<GetGeneNameResponse> createGetGeneNameResponse(GetGeneNameResponse value) {
        return new JAXBElement<GetGeneNameResponse>(_GetGeneNameResponse_QNAME, GetGeneNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetchromName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getchromName")
    public JAXBElement<GetchromName> createGetchromName(GetchromName value) {
        return new JAXBElement<GetchromName>(_GetchromName_QNAME, GetchromName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranscriptMappingInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "TranscriptMappingInfo")
    public JAXBElement<TranscriptMappingInfo> createTranscriptMappingInfo(TranscriptMappingInfo value) {
        return new JAXBElement<TranscriptMappingInfo>(_TranscriptMappingInfo_QNAME, TranscriptMappingInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSyntaxOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "CheckSyntaxOutput")
    public JAXBElement<CheckSyntaxOutput> createCheckSyntaxOutput(CheckSyntaxOutput value) {
        return new JAXBElement<CheckSyntaxOutput>(_CheckSyntaxOutput_QNAME, CheckSyntaxOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeRawVar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "DescribeRawVar")
    public JAXBElement<DescribeRawVar> createDescribeRawVar(DescribeRawVar value) {
        return new JAXBElement<DescribeRawVar>(_DescribeRawVar_QNAME, DescribeRawVar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitBatchJobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "submitBatchJobResponse")
    public JAXBElement<SubmitBatchJobResponse> createSubmitBatchJobResponse(SubmitBatchJobResponse value) {
        return new JAXBElement<SubmitBatchJobResponse>(_SubmitBatchJobResponse_QNAME, SubmitBatchJobResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MutalyzerOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "MutalyzerOutput")
    public JAXBElement<MutalyzerOutput> createMutalyzerOutput(MutalyzerOutput value) {
        return new JAXBElement<MutalyzerOutput>(_MutalyzerOutput_QNAME, MutalyzerOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscriptsMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsMapping")
    public JAXBElement<GetTranscriptsMapping> createGetTranscriptsMapping(GetTranscriptsMapping value) {
        return new JAXBElement<GetTranscriptsMapping>(_GetTranscriptsMapping_QNAME, GetTranscriptsMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitBatchJob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "submitBatchJob")
    public JAXBElement<SubmitBatchJob> createSubmitBatchJob(SubmitBatchJob value) {
        return new JAXBElement<SubmitBatchJob>(_SubmitBatchJob_QNAME, SubmitBatchJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneAndTranscriptResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getGeneAndTranscriptResponse")
    public JAXBElement<GetGeneAndTranscriptResponse> createGetGeneAndTranscriptResponse(GetGeneAndTranscriptResponse value) {
        return new JAXBElement<GetGeneAndTranscriptResponse>(_GetGeneAndTranscriptResponse_QNAME, GetGeneAndTranscriptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SliceChromosome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "sliceChromosome")
    public JAXBElement<SliceChromosome> createSliceChromosome(SliceChromosome value) {
        return new JAXBElement<SliceChromosome>(_SliceChromosome_QNAME, SliceChromosome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBatchJobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getBatchJobResponse")
    public JAXBElement<GetBatchJobResponse> createGetBatchJobResponse(GetBatchJobResponse value) {
        return new JAXBElement<GetBatchJobResponse>(_GetBatchJobResponse_QNAME, GetBatchJobResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChromosomeName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromosomeName")
    public JAXBElement<ChromosomeName> createChromosomeName(ChromosomeName value) {
        return new JAXBElement<ChromosomeName>(_ChromosomeName_QNAME, ChromosomeName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscripts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscripts")
    public JAXBElement<GetTranscripts> createGetTranscripts(GetTranscripts value) {
        return new JAXBElement<GetTranscripts>(_GetTranscripts_QNAME, GetTranscripts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetchromNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getchromNameResponse")
    public JAXBElement<GetchromNameResponse> createGetchromNameResponse(GetchromNameResponse value) {
        return new JAXBElement<GetchromNameResponse>(_GetchromNameResponse_QNAME, GetchromNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getGeneName")
    public JAXBElement<GetGeneName> createGetGeneName(GetGeneName value) {
        return new JAXBElement<GetGeneName>(_GetGeneName_QNAME, GetGeneName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapMessageArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "SoapMessageArray")
    public JAXBElement<SoapMessageArray> createSoapMessageArray(SoapMessageArray value) {
        return new JAXBElement<SoapMessageArray>(_SoapMessageArray_QNAME, SoapMessageArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionExtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "descriptionExtractResponse")
    public JAXBElement<DescriptionExtractResponse> createDescriptionExtractResponse(DescriptionExtractResponse value) {
        return new JAXBElement<DescriptionExtractResponse>(_DescriptionExtractResponse_QNAME, DescriptionExtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitorBatchJobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "monitorBatchJobResponse")
    public JAXBElement<MonitorBatchJobResponse> createMonitorBatchJobResponse(MonitorBatchJobResponse value) {
        return new JAXBElement<MonitorBatchJobResponse>(_MonitorBatchJobResponse_QNAME, MonitorBatchJobResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSyntaxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "checkSyntaxResponse")
    public JAXBElement<CheckSyntaxResponse> createCheckSyntaxResponse(CheckSyntaxResponse value) {
        return new JAXBElement<CheckSyntaxResponse>(_CheckSyntaxResponse_QNAME, CheckSyntaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "Mapping")
    public JAXBElement<Mapping> createMapping(Mapping value) {
        return new JAXBElement<Mapping>(_Mapping_QNAME, Mapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscriptsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsResponse")
    public JAXBElement<GetTranscriptsResponse> createGetTranscriptsResponse(GetTranscriptsResponse value) {
        return new JAXBElement<GetTranscriptsResponse>(_GetTranscriptsResponse_QNAME, GetTranscriptsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCacheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getCacheResponse")
    public JAXBElement<GetCacheResponse> createGetCacheResponse(GetCacheResponse value) {
        return new JAXBElement<GetCacheResponse>(_GetCacheResponse_QNAME, GetCacheResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "infoResponse")
    public JAXBElement<InfoResponse> createInfoResponse(InfoResponse value) {
        return new JAXBElement<InfoResponse>(_InfoResponse_QNAME, InfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCache }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getCache")
    public JAXBElement<GetCache> createGetCache(GetCache value) {
        return new JAXBElement<GetCache>(_GetCache_QNAME, GetCache.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadGenBankRemoteFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "uploadGenBankRemoteFile")
    public JAXBElement<UploadGenBankRemoteFile> createUploadGenBankRemoteFile(UploadGenBankRemoteFile value) {
        return new JAXBElement<UploadGenBankRemoteFile>(_UploadGenBankRemoteFile_QNAME, UploadGenBankRemoteFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscriptsMappingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsMappingResponse")
    public JAXBElement<GetTranscriptsMappingResponse> createGetTranscriptsMappingResponse(GetTranscriptsMappingResponse value) {
        return new JAXBElement<GetTranscriptsMappingResponse>(_GetTranscriptsMappingResponse_QNAME, GetTranscriptsMappingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadGenBankLocalFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "uploadGenBankLocalFileResponse")
    public JAXBElement<UploadGenBankLocalFileResponse> createUploadGenBankLocalFileResponse(UploadGenBankLocalFileResponse value) {
        return new JAXBElement<UploadGenBankLocalFileResponse>(_UploadGenBankLocalFileResponse_QNAME, UploadGenBankLocalFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProteinTranscript }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "ProteinTranscript")
    public JAXBElement<ProteinTranscript> createProteinTranscript(ProteinTranscript value) {
        return new JAXBElement<ProteinTranscript>(_ProteinTranscript_QNAME, ProteinTranscript.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBatchJob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getBatchJob")
    public JAXBElement<GetBatchJob> createGetBatchJob(GetBatchJob value) {
        return new JAXBElement<GetBatchJob>(_GetBatchJob_QNAME, GetBatchJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "mappingInfoResponse")
    public JAXBElement<MappingInfoResponse> createMappingInfoResponse(MappingInfoResponse value) {
        return new JAXBElement<MappingInfoResponse>(_MappingInfoResponse_QNAME, MappingInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunMutalyzer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "runMutalyzer")
    public JAXBElement<RunMutalyzer> createRunMutalyzer(RunMutalyzer value) {
        return new JAXBElement<RunMutalyzer>(_RunMutalyzer_QNAME, RunMutalyzer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacheEntryArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "CacheEntryArray")
    public JAXBElement<CacheEntryArray> createCacheEntryArray(CacheEntryArray value) {
        return new JAXBElement<CacheEntryArray>(_CacheEntryArray_QNAME, CacheEntryArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "pingResponse")
    public JAXBElement<PingResponse> createPingResponse(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponse_QNAME, PingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionExtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "descriptionExtract")
    public JAXBElement<DescriptionExtract> createDescriptionExtract(DescriptionExtract value) {
        return new JAXBElement<DescriptionExtract>(_DescriptionExtract_QNAME, DescriptionExtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranscriptNameInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "TranscriptNameInfo")
    public JAXBElement<TranscriptNameInfo> createTranscriptNameInfo(TranscriptNameInfo value) {
        return new JAXBElement<TranscriptNameInfo>(_TranscriptNameInfo_QNAME, TranscriptNameInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranscriptInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "transcriptInfoResponse")
    public JAXBElement<TranscriptInfoResponse> createTranscriptInfoResponse(TranscriptInfoResponse value) {
        return new JAXBElement<TranscriptInfoResponse>(_TranscriptInfoResponse_QNAME, TranscriptInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscriptsRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsRangeResponse")
    public JAXBElement<GetTranscriptsRangeResponse> createGetTranscriptsRangeResponse(GetTranscriptsRangeResponse value) {
        return new JAXBElement<GetTranscriptsRangeResponse>(_GetTranscriptsRangeResponse_QNAME, GetTranscriptsRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExonInfoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "ExonInfoArray")
    public JAXBElement<ExonInfoArray> createExonInfoArray(ExonInfoArray value) {
        return new JAXBElement<ExonInfoArray>(_ExonInfoArray_QNAME, ExonInfoArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "numberConversion")
    public JAXBElement<NumberConversion> createNumberConversion(NumberConversion value) {
        return new JAXBElement<NumberConversion>(_NumberConversion_QNAME, NumberConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RawVar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "RawVar")
    public JAXBElement<RawVar> createRawVar(RawVar value) {
        return new JAXBElement<RawVar>(_RawVar_QNAME, RawVar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranscriptInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "TranscriptInfo")
    public JAXBElement<TranscriptInfo> createTranscriptInfo(TranscriptInfo value) {
        return new JAXBElement<TranscriptInfo>(_TranscriptInfo_QNAME, TranscriptInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "created_since", scope = GetCache.class)
    public JAXBElement<XMLGregorianCalendar> createGetCacheCreatedSince(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetCacheCreatedSince_QNAME, XMLGregorianCalendar.class, GetCache.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "numberConversionResult", scope = NumberConversionResponse.class)
    public JAXBElement<StringArray> createNumberConversionResponseNumberConversionResult(StringArray value) {
        return new JAXBElement<StringArray>(_NumberConversionResponseNumberConversionResult_QNAME, StringArray.class, NumberConversionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "submitBatchJobResult", scope = SubmitBatchJobResponse.class)
    public JAXBElement<String> createSubmitBatchJobResponseSubmitBatchJobResult(String value) {
        return new JAXBElement<String>(_SubmitBatchJobResponseSubmitBatchJobResult_QNAME, String.class, SubmitBatchJobResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "versions", scope = GetTranscripts.class)
    public JAXBElement<Boolean> createGetTranscriptsVersions(Boolean value) {
        return new JAXBElement<Boolean>(_GetTranscriptsVersions_QNAME, Boolean.class, GetTranscripts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranscriptMappingInfoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsMappingResult", scope = GetTranscriptsMappingResponse.class)
    public JAXBElement<TranscriptMappingInfoArray> createGetTranscriptsMappingResponseGetTranscriptsMappingResult(TranscriptMappingInfoArray value) {
        return new JAXBElement<TranscriptMappingInfoArray>(_GetTranscriptsMappingResponseGetTranscriptsMappingResult_QNAME, TranscriptMappingInfoArray.class, GetTranscriptsMappingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsRangeResult", scope = GetTranscriptsRangeResponse.class)
    public JAXBElement<StringArray> createGetTranscriptsRangeResponseGetTranscriptsRangeResult(StringArray value) {
        return new JAXBElement<StringArray>(_GetTranscriptsRangeResponseGetTranscriptsRangeResult_QNAME, StringArray.class, GetTranscriptsRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSyntaxOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "checkSyntaxResult", scope = CheckSyntaxResponse.class)
    public JAXBElement<CheckSyntaxOutput> createCheckSyntaxResponseCheckSyntaxResult(CheckSyntaxOutput value) {
        return new JAXBElement<CheckSyntaxOutput>(_CheckSyntaxResponseCheckSyntaxResult_QNAME, CheckSyntaxOutput.class, CheckSyntaxResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "releaseDate", scope = InfoOutput.class)
    public JAXBElement<String> createInfoOutputReleaseDate(String value) {
        return new JAXBElement<String>(_InfoOutputReleaseDate_QNAME, String.class, InfoOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "announcement", scope = InfoOutput.class)
    public JAXBElement<String> createInfoOutputAnnouncement(String value) {
        return new JAXBElement<String>(_InfoOutputAnnouncement_QNAME, String.class, InfoOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "announcementUrl", scope = InfoOutput.class)
    public JAXBElement<String> createInfoOutputAnnouncementUrl(String value) {
        return new JAXBElement<String>(_InfoOutputAnnouncementUrl_QNAME, String.class, InfoOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "nomenclatureVersion", scope = InfoOutput.class)
    public JAXBElement<String> createInfoOutputNomenclatureVersion(String value) {
        return new JAXBElement<String>(_InfoOutputNomenclatureVersion_QNAME, String.class, InfoOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "versionParts", scope = InfoOutput.class)
    public JAXBElement<StringArray> createInfoOutputVersionParts(StringArray value) {
        return new JAXBElement<StringArray>(_InfoOutputVersionParts_QNAME, StringArray.class, InfoOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "contactEmail", scope = InfoOutput.class)
    public JAXBElement<String> createInfoOutputContactEmail(String value) {
        return new JAXBElement<String>(_InfoOutputContactEmail_QNAME, String.class, InfoOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "nomenclatureVersionParts", scope = InfoOutput.class)
    public JAXBElement<StringArray> createInfoOutputNomenclatureVersionParts(StringArray value) {
        return new JAXBElement<StringArray>(_InfoOutputNomenclatureVersionParts_QNAME, StringArray.class, InfoOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "version", scope = InfoOutput.class)
    public JAXBElement<String> createInfoOutputVersion(String value) {
        return new JAXBElement<String>(_InfoOutputVersion_QNAME, String.class, InfoOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "serverName", scope = InfoOutput.class)
    public JAXBElement<String> createInfoOutputServerName(String value) {
        return new JAXBElement<String>(_InfoOutputServerName_QNAME, String.class, InfoOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getdbSNPDescriptionsResult", scope = GetdbSNPDescriptionsResponse.class)
    public JAXBElement<StringArray> createGetdbSNPDescriptionsResponseGetdbSNPDescriptionsResult(StringArray value) {
        return new JAXBElement<StringArray>(_GetdbSNPDescriptionsResponseGetdbSNPDescriptionsResult_QNAME, StringArray.class, GetdbSNPDescriptionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "geneName", scope = GetTranscriptsAndInfo.class)
    public JAXBElement<String> createGetTranscriptsAndInfoGeneName(String value) {
        return new JAXBElement<String>(_GetTranscriptsAndInfoGeneName_QNAME, String.class, GetTranscriptsAndInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "endmain", scope = Mapping.class)
    public JAXBElement<BigInteger> createMappingEndmain(BigInteger value) {
        return new JAXBElement<BigInteger>(_MappingEndmain_QNAME, BigInteger.class, Mapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "startmain", scope = Mapping.class)
    public JAXBElement<BigInteger> createMappingStartmain(BigInteger value) {
        return new JAXBElement<BigInteger>(_MappingStartmain_QNAME, BigInteger.class, Mapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "endoffset", scope = Mapping.class)
    public JAXBElement<BigInteger> createMappingEndoffset(BigInteger value) {
        return new JAXBElement<BigInteger>(_MappingEndoffset_QNAME, BigInteger.class, Mapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "errorcode", scope = Mapping.class)
    public JAXBElement<BigInteger> createMappingErrorcode(BigInteger value) {
        return new JAXBElement<BigInteger>(_MappingErrorcode_QNAME, BigInteger.class, Mapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "end_g", scope = Mapping.class)
    public JAXBElement<BigInteger> createMappingEndG(BigInteger value) {
        return new JAXBElement<BigInteger>(_MappingEndG_QNAME, BigInteger.class, Mapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "mutationType", scope = Mapping.class)
    public JAXBElement<String> createMappingMutationType(String value) {
        return new JAXBElement<String>(_MappingMutationType_QNAME, String.class, Mapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapMessageArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "messages", scope = Mapping.class)
    public JAXBElement<SoapMessageArray> createMappingMessages(SoapMessageArray value) {
        return new JAXBElement<SoapMessageArray>(_MappingMessages_QNAME, SoapMessageArray.class, Mapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "start_g", scope = Mapping.class)
    public JAXBElement<BigInteger> createMappingStartG(BigInteger value) {
        return new JAXBElement<BigInteger>(_MappingStartG_QNAME, BigInteger.class, Mapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "startoffset", scope = Mapping.class)
    public JAXBElement<BigInteger> createMappingStartoffset(BigInteger value) {
        return new JAXBElement<BigInteger>(_MappingStartoffset_QNAME, BigInteger.class, Mapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "infoResult", scope = InfoResponse.class)
    public JAXBElement<InfoOutput> createInfoResponseInfoResult(InfoOutput value) {
        return new JAXBElement<InfoOutput>(_InfoResponseInfoResult_QNAME, InfoOutput.class, InfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromStart", scope = ExonInfo.class)
    public JAXBElement<BigInteger> createExonInfoChromStart(BigInteger value) {
        return new JAXBElement<BigInteger>(_ExonInfoChromStart_QNAME, BigInteger.class, ExonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromStop", scope = ExonInfo.class)
    public JAXBElement<BigInteger> createExonInfoChromStop(BigInteger value) {
        return new JAXBElement<BigInteger>(_ExonInfoChromStop_QNAME, BigInteger.class, ExonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "gene", scope = NumberConversion.class)
    public JAXBElement<String> createNumberConversionGene(String value) {
        return new JAXBElement<String>(_NumberConversionGene_QNAME, String.class, NumberConversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getBatchJobResult", scope = GetBatchJobResponse.class)
    public JAXBElement<byte[]> createGetBatchJobResponseGetBatchJobResult(byte[] value) {
        return new JAXBElement<byte[]>(_GetBatchJobResponseGetBatchJobResult_QNAME, byte[].class, GetBatchJobResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "mappingInfoResult", scope = MappingInfoResponse.class)
    public JAXBElement<Mapping> createMappingInfoResponseMappingInfoResult(Mapping value) {
        return new JAXBElement<Mapping>(_MappingInfoResponseMappingInfoResult_QNAME, Mapping.class, MappingInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MutalyzerOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "runMutalyzerResult", scope = RunMutalyzerResponse.class)
    public JAXBElement<MutalyzerOutput> createRunMutalyzerResponseRunMutalyzerResult(MutalyzerOutput value) {
        return new JAXBElement<MutalyzerOutput>(_RunMutalyzerResponseRunMutalyzerResult_QNAME, MutalyzerOutput.class, RunMutalyzerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsByGeneNameResult", scope = GetTranscriptsByGeneNameResponse.class)
    public JAXBElement<StringArray> createGetTranscriptsByGeneNameResponseGetTranscriptsByGeneNameResult(StringArray value) {
        return new JAXBElement<StringArray>(_GetTranscriptsByGeneNameResponseGetTranscriptsByGeneNameResult_QNAME, StringArray.class, GetTranscriptsByGeneNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RawVarArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "allele", scope = Allele.class)
    public JAXBElement<RawVarArray> createAlleleAllele(RawVarArray value) {
        return new JAXBElement<RawVarArray>(_AlleleAllele_QNAME, RawVarArray.class, Allele.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "argument", scope = SubmitBatchJob.class)
    public JAXBElement<String> createSubmitBatchJobArgument(String value) {
        return new JAXBElement<String>(_SubmitBatchJobArgument_QNAME, String.class, SubmitBatchJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "process", scope = SubmitBatchJob.class)
    public JAXBElement<String> createSubmitBatchJobProcess(String value) {
        return new JAXBElement<String>(_SubmitBatchJobProcess_QNAME, String.class, SubmitBatchJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "monitorBatchJobResult", scope = MonitorBatchJobResponse.class)
    public JAXBElement<BigInteger> createMonitorBatchJobResponseMonitorBatchJobResult(BigInteger value) {
        return new JAXBElement<BigInteger>(_MonitorBatchJobResponseMonitorBatchJobResult_QNAME, BigInteger.class, MonitorBatchJobResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "trans_stop", scope = Transcript.class)
    public JAXBElement<BigInteger> createTranscriptTransStop(BigInteger value) {
        return new JAXBElement<BigInteger>(_TranscriptTransStop_QNAME, BigInteger.class, Transcript.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "CDS_stop", scope = Transcript.class)
    public JAXBElement<BigInteger> createTranscriptCDSStop(BigInteger value) {
        return new JAXBElement<BigInteger>(_TranscriptCDSStop_QNAME, BigInteger.class, Transcript.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "trans_start", scope = Transcript.class)
    public JAXBElement<BigInteger> createTranscriptTransStart(BigInteger value) {
        return new JAXBElement<BigInteger>(_TranscriptTransStart_QNAME, BigInteger.class, Transcript.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "newProtein", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputNewProtein(String value) {
        return new JAXBElement<String>(_MutalyzerOutputNewProtein_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "transcriptDescriptions", scope = MutalyzerOutput.class)
    public JAXBElement<StringArray> createMutalyzerOutputTranscriptDescriptions(StringArray value) {
        return new JAXBElement<StringArray>(_MutalyzerOutputTranscriptDescriptions_QNAME, StringArray.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "summary", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputSummary(String value) {
        return new JAXBElement<String>(_MutalyzerOutputSummary_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "mutatedMRNA", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputMutatedMRNA(String value) {
        return new JAXBElement<String>(_MutalyzerOutputMutatedMRNA_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "origProtein", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputOrigProtein(String value) {
        return new JAXBElement<String>(_MutalyzerOutputOrigProtein_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "proteinDescriptions", scope = MutalyzerOutput.class)
    public JAXBElement<StringArray> createMutalyzerOutputProteinDescriptions(StringArray value) {
        return new JAXBElement<StringArray>(_MutalyzerOutputProteinDescriptions_QNAME, StringArray.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "genomicDescription", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputGenomicDescription(String value) {
        return new JAXBElement<String>(_MutalyzerOutputGenomicDescription_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RawVariantArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "rawVariants", scope = MutalyzerOutput.class)
    public JAXBElement<RawVariantArray> createMutalyzerOutputRawVariants(RawVariantArray value) {
        return new JAXBElement<RawVariantArray>(_MutalyzerOutputRawVariants_QNAME, RawVariantArray.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "sourceGi", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputSourceGi(String value) {
        return new JAXBElement<String>(_MutalyzerOutputSourceGi_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapMessageArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "messages", scope = MutalyzerOutput.class)
    public JAXBElement<SoapMessageArray> createMutalyzerOutputMessages(SoapMessageArray value) {
        return new JAXBElement<SoapMessageArray>(_MappingMessages_QNAME, SoapMessageArray.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "origMRNA", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputOrigMRNA(String value) {
        return new JAXBElement<String>(_MutalyzerOutputOrigMRNA_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "errors", scope = MutalyzerOutput.class)
    public JAXBElement<BigInteger> createMutalyzerOutputErrors(BigInteger value) {
        return new JAXBElement<BigInteger>(_MutalyzerOutputErrors_QNAME, BigInteger.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExonInfoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "exons", scope = MutalyzerOutput.class)
    public JAXBElement<ExonInfoArray> createMutalyzerOutputExons(ExonInfoArray value) {
        return new JAXBElement<ExonInfoArray>(_MutalyzerOutputExons_QNAME, ExonInfoArray.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "sourceVersion", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputSourceVersion(String value) {
        return new JAXBElement<String>(_MutalyzerOutputSourceVersion_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "newCDS", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputNewCDS(String value) {
        return new JAXBElement<String>(_MutalyzerOutputNewCDS_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "original", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputOriginal(String value) {
        return new JAXBElement<String>(_MutalyzerOutputOriginal_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromDescription", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputChromDescription(String value) {
        return new JAXBElement<String>(_MutalyzerOutputChromDescription_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "sourceAccession", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputSourceAccession(String value) {
        return new JAXBElement<String>(_MutalyzerOutputSourceAccession_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "mutated", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputMutated(String value) {
        return new JAXBElement<String>(_MutalyzerOutputMutated_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "origCDS", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputOrigCDS(String value) {
        return new JAXBElement<String>(_MutalyzerOutputOrigCDS_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "altProtein", scope = MutalyzerOutput.class)
    public JAXBElement<String> createMutalyzerOutputAltProtein(String value) {
        return new JAXBElement<String>(_MutalyzerOutputAltProtein_QNAME, String.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "warnings", scope = MutalyzerOutput.class)
    public JAXBElement<BigInteger> createMutalyzerOutputWarnings(BigInteger value) {
        return new JAXBElement<BigInteger>(_MutalyzerOutputWarnings_QNAME, BigInteger.class, MutalyzerOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Allele }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "descriptionExtractResult", scope = DescriptionExtractResponse.class)
    public JAXBElement<Allele> createDescriptionExtractResponseDescriptionExtractResult(Allele value) {
        return new JAXBElement<Allele>(_DescriptionExtractResponseDescriptionExtractResult_QNAME, Allele.class, DescriptionExtractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranscriptInfoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsAndInfoResult", scope = GetTranscriptsAndInfoResponse.class)
    public JAXBElement<TranscriptInfoArray> createGetTranscriptsAndInfoResponseGetTranscriptsAndInfoResult(TranscriptInfoArray value) {
        return new JAXBElement<TranscriptInfoArray>(_GetTranscriptsAndInfoResponseGetTranscriptsAndInfoResult_QNAME, TranscriptInfoArray.class, GetTranscriptsAndInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacheEntryArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getCacheResult", scope = GetCacheResponse.class)
    public JAXBElement<CacheEntryArray> createGetCacheResponseGetCacheResult(CacheEntryArray value) {
        return new JAXBElement<CacheEntryArray>(_GetCacheResponseGetCacheResult_QNAME, CacheEntryArray.class, GetCacheResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transcript }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "transcriptInfoResult", scope = TranscriptInfoResponse.class)
    public JAXBElement<Transcript> createTranscriptInfoResponseTranscriptInfoResult(Transcript value) {
        return new JAXBElement<Transcript>(_TranscriptInfoResponseTranscriptInfoResult_QNAME, Transcript.class, TranscriptInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranscriptNameInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getGeneAndTranscriptResult", scope = GetGeneAndTranscriptResponse.class)
    public JAXBElement<TranscriptNameInfo> createGetGeneAndTranscriptResponseGetGeneAndTranscriptResult(TranscriptNameInfo value) {
        return new JAXBElement<TranscriptNameInfo>(_GetGeneAndTranscriptResponseGetGeneAndTranscriptResult_QNAME, TranscriptNameInfo.class, GetGeneAndTranscriptResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "getTranscriptsResult", scope = GetTranscriptsResponse.class)
    public JAXBElement<StringArray> createGetTranscriptsResponseGetTranscriptsResult(StringArray value) {
        return new JAXBElement<StringArray>(_GetTranscriptsResponseGetTranscriptsResult_QNAME, StringArray.class, GetTranscriptsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "cached", scope = CacheEntry.class)
    public JAXBElement<String> createCacheEntryCached(String value) {
        return new JAXBElement<String>(_CacheEntryCached_QNAME, String.class, CacheEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromosomeStart", scope = CacheEntry.class)
    public JAXBElement<BigInteger> createCacheEntryChromosomeStart(BigInteger value) {
        return new JAXBElement<BigInteger>(_CacheEntryChromosomeStart_QNAME, BigInteger.class, CacheEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "gi", scope = CacheEntry.class)
    public JAXBElement<String> createCacheEntryGi(String value) {
        return new JAXBElement<String>(_CacheEntryGi_QNAME, String.class, CacheEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromosomeOrientation", scope = CacheEntry.class)
    public JAXBElement<BigInteger> createCacheEntryChromosomeOrientation(BigInteger value) {
        return new JAXBElement<BigInteger>(_CacheEntryChromosomeOrientation_QNAME, BigInteger.class, CacheEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromosomeName", scope = CacheEntry.class)
    public JAXBElement<String> createCacheEntryChromosomeName(String value) {
        return new JAXBElement<String>(_ChromosomeName_QNAME, String.class, CacheEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromosomeStop", scope = CacheEntry.class)
    public JAXBElement<BigInteger> createCacheEntryChromosomeStop(BigInteger value) {
        return new JAXBElement<BigInteger>(_CacheEntryChromosomeStop_QNAME, BigInteger.class, CacheEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "url", scope = CacheEntry.class)
    public JAXBElement<String> createCacheEntryUrl(String value) {
        return new JAXBElement<String>(_CacheEntryUrl_QNAME, String.class, CacheEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExonInfoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "exons", scope = TranscriptInfo.class)
    public JAXBElement<ExonInfoArray> createTranscriptInfoExons(ExonInfoArray value) {
        return new JAXBElement<ExonInfoArray>(_MutalyzerOutputExons_QNAME, ExonInfoArray.class, TranscriptInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromCDSStart", scope = TranscriptInfo.class)
    public JAXBElement<BigInteger> createTranscriptInfoChromCDSStart(BigInteger value) {
        return new JAXBElement<BigInteger>(_TranscriptInfoChromCDSStart_QNAME, BigInteger.class, TranscriptInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProteinTranscript }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "proteinTranscript", scope = TranscriptInfo.class)
    public JAXBElement<ProteinTranscript> createTranscriptInfoProteinTranscript(ProteinTranscript value) {
        return new JAXBElement<ProteinTranscript>(_TranscriptInfoProteinTranscript_QNAME, ProteinTranscript.class, TranscriptInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromTransStart", scope = TranscriptInfo.class)
    public JAXBElement<BigInteger> createTranscriptInfoChromTransStart(BigInteger value) {
        return new JAXBElement<BigInteger>(_TranscriptInfoChromTransStart_QNAME, BigInteger.class, TranscriptInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromCDSStop", scope = TranscriptInfo.class)
    public JAXBElement<BigInteger> createTranscriptInfoChromCDSStop(BigInteger value) {
        return new JAXBElement<BigInteger>(_TranscriptInfoChromCDSStop_QNAME, BigInteger.class, TranscriptInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "chromTransEnd", scope = TranscriptInfo.class)
    public JAXBElement<BigInteger> createTranscriptInfoChromTransEnd(BigInteger value) {
        return new JAXBElement<BigInteger>(_TranscriptInfoChromTransEnd_QNAME, BigInteger.class, TranscriptInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapMessageArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mutalyzer.nl/2.0/services", name = "messages", scope = CheckSyntaxOutput.class)
    public JAXBElement<SoapMessageArray> createCheckSyntaxOutputMessages(SoapMessageArray value) {
        return new JAXBElement<SoapMessageArray>(_MappingMessages_QNAME, SoapMessageArray.class, CheckSyntaxOutput.class, value);
    }

}
