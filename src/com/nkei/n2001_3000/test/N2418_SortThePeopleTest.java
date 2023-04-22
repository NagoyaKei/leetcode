package com.nkei.n2001_3000.test;

import com.nkei.main.test.helpers.TimingExtension;
import com.nkei.n2001_3000.N2418_SortThePeople;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(TimingExtension.class)
class N2418_SortThePeopleTest {

    @Test
    void sortPeople() {
        N2418_SortThePeople solution = new N2418_SortThePeople();
        String[] result = solution.sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170});
        assertArrayEquals(new String[] {"Mary", "Emma", "John"}, result);
    }

    @Test
    void sortPeople2() {
        N2418_SortThePeople solution = new N2418_SortThePeople();
        String[] result = solution.sortPeople(
                new String[]{"QSXT", "A", "EWJXZLVLBZPGYQLVDZe", "ONFLAPLOWQEFwynun", "FUTxqyrelo", "IOQZFSTXSDVBQM", "ZFgxpgiwqjdclim", "QZ",
                        "OAWXABTPJZZVO", "KJFLSORihirvqcp", "Urmpgtibd", "GHXIWWZIIJZRMTYHZNR", "AOKbuabrusrx", "LTYXsi", "DTXl", "Kerr", "Hzezekhpetnds",
                        "VZvyfuewqfvzllfc", "MIWXGwc", "RZUPdrflbfoarikrhvx", "APXPCigztuakkkyslhwg", "JQTKLRCAZrlmwiqkuye", "ZN", "GTWLDchwlb", "C",
                        "VJGRMOQEVYXNodxpcyh", "PPHHnlw", "LLADHOXKGSCGEdgiemxd", "CBLd", "JRYXPSWUAUM", "Z", "OQSWHUPOQFTthzeduc", "LZGXKB",
                        "AGJCIBOxwetlepgoze", "TIZNMHMOCEQATWbuqigi", "XJ", "FKMUEXz", "FSROKDTPRSnq", "NDMvlyrhdodnqdybbozp", "NAMEWIHGGFsgggcnvq", "R",
                        "EWLeppmngitbeny", "MSFSIoimjln", "EGSIOXn", "PHOUUlckeexcz", "QLVLCUjvod", "GITDOSUUWhyrulbhzacd", "ZJQQAgaggf", "HSHWuxuzlvocovh"
                        , "TYOQOthrfm", "JBESsjrsc", "PBYJpwruwfgkkstx", "ANQZXGKVNLCSpzkwsic", "OBvkcybneet", "HLngkytfiaxbgzolox", "Gtxrhebdjq",
                        "OMNZBRFn", "Erfwwhuqw", "NLt", "LJYE", "XSLNOFYCQFHgdffchw", "J", "XSMBHEWHRIDDQRLRVRk", "BSi", "XNODX", "Xqy", "Gslwlywabqc", "GMFLHSztig", "Muef", "Jzipcwswjbzev"},
                new int[]{1734, 37804, 84881, 5022, 40412, 49596, 8249, 14207, 74452, 54483, 78061, 42692, 59503, 13141, 8312,
                        68115,
                        31668, 5334,
                        8216, 2559, 50052, 29157, 738, 30263, 35445, 33652, 22944, 40516, 25190, 9611, 86870, 34239, 68570, 28680, 45816, 41305, 5985,
                        29216, 98926, 34592, 96739, 85960, 21324, 85700, 41181, 66648, 9836, 22697, 34900, 26385, 4948, 31996, 97941, 33336, 43681, 97615,
                        74974, 39821, 31669, 52743, 92320, 35944, 17383, 30264, 21459, 66335, 62380, 53906, 25270, 40837});
        assertArrayEquals(
                new String[] {"NDMvlyrhdodnqdybbozp","ANQZXGKVNLCSpzkwsic","Gtxrhebdjq","R","XSLNOFYCQFHgdffchw","Z","EWLeppmngitbeny","EGSIOXn","EWJXZLVLBZPGYQLVDZe","Urmpgtibd","OMNZBRFn","OAWXABTPJZZVO","LZGXKB","Kerr","QLVLCUjvod","Xqy","Gslwlywabqc","AOKbuabrusrx","KJFLSORihirvqcp","GMFLHSztig","LJYE","APXPCigztuakkkyslhwg","IOQZFSTXSDVBQM","TIZNMHMOCEQATWbuqigi","HLngkytfiaxbgzolox","GHXIWWZIIJZRMTYHZNR","XJ","PHOUUlckeexcz","Jzipcwswjbzev","LLADHOXKGSCGEdgiemxd","FUTxqyrelo","Erfwwhuqw","A","J","C","HSHWuxuzlvocovh","NAMEWIHGGFsgggcnvq","OQSWHUPOQFTthzeduc","VJGRMOQEVYXNodxpcyh","OBvkcybneet","PBYJpwruwfgkkstx","NLt","Hzezekhpetnds","BSi","GTWLDchwlb","FSROKDTPRSnq","JQTKLRCAZrlmwiqkuye","AGJCIBOxwetlepgoze","TYOQOthrfm","Muef","CBLd","PPHHnlw","ZJQQAgaggf","XNODX","MSFSIoimjln","XSMBHEWHRIDDQRLRVRk","QZ","LTYXsi","GITDOSUUWhyrulbhzacd","JRYXPSWUAUM","DTXl","ZFgxpgiwqjdclim","MIWXGwc","FKMUEXz","VZvyfuewqfvzllfc","ONFLAPLOWQEFwynun","JBESsjrsc","RZUPdrflbfoarikrhvx","QSXT","ZN"},
                result);
    }
}