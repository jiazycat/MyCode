package xslt;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WeekPlanning {


		public void writeFile(String filename, int lop) {
			try {
				FileWriter fw = null;
				File f = new File("D:/xml/fmwin/Week-Planning." + filename);
				fw = new FileWriter(f, true);
				PrintWriter pw = new PrintWriter(fw);

				pw.println("<Planning>");
				for (int i = 0; i < lop; i++) {

					if (filename == "txt") {
						pw.print("P111-P111-P111-P111-P111");
						pw.print("P111,");   
						pw.print("P111,");   
						pw.print("P111,");   
						pw.print("P111,");   
						pw.print("P111,");   
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("201701,"); 
						pw.print("201701,"); 
						pw.print("1,");      
						pw.print("1,");      
						pw.print("1,");      
						pw.print("1,");      
						pw.print("1,");      
						pw.print("1,");      
						pw.print("1,");      
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,");          
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("PPPPPP,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("UOM10,");  
						pw.print("111111,"); 
						pw.print("PPPPPP,"); 
						pw.print("PPPPPP,"); 
						pw.print("PPPPPP,"); 
						pw.print("PPPPPP,"); 
						pw.print("PPPPPP,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("201701,"); 
						pw.print("201701,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print(","); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.print("111111,"); 
						pw.println("111111,"); 
					} else if (filename == "xml") {
						pw.println("<Item>");

						pw.println("<Node>P111-P111-P111-P111-P111</Node>");
						pw.println("<Fam>P111</Fam>");
						pw.println("<Geo>P111</Geo>");
						pw.println("<Dis>P111</Dis>");
						pw.println("<Dim4>P111</Dim4>");
						pw.println("<Dim5>P111</Dim5>");
						pw.println("<TransitLead>111111</TransitLead>");
						pw.println("<SafetyStock>111111</SafetyStock>");
						pw.println("<SafetyTime>111111</SafetyTime>");
						pw.println("<ServLevel>111111</ServLevel>");
						pw.println("<LeadTime>111111</LeadTime>");
						pw.println("<MinOrdQty1>111111</MinOrdQty1>");
						pw.println("<LotSize>111111</LotSize>");
						pw.println("<NotUsed1>111111</NotUsed1>");
						pw.println("<NotUsed2>111111</NotUsed2>");
						pw.println("<OrdMin>111111</OrdMin>");
						pw.println("<MaxOrdQty1>111111</MaxOrdQty1>");
						pw.println("<OrdFrequency>111111</OrdFrequency>");
						pw.println("<OrdFrequencyFrom>111111</OrdFrequencyFrom>");
						pw.println("<OrdFreqPlan>111111</OrdFreqPlan>");
						pw.println("<PlanHorizonFrom>201701</PlanHorizonFrom>");
						pw.println("<PlanHorizonTo>201701</PlanHorizonTo>");
						pw.println("<ShipDay1>1</ShipDay1>");
						pw.println("<ShipDay2>1</ShipDay2>");
						pw.println("<ShipDay3>1</ShipDay3>");
						pw.println("<ShipDay4>1</ShipDay4>");
						pw.println("<ShipDay5>1</ShipDay5>");
						pw.println("<ShipDay6>1</ShipDay6>");
						pw.println("<ShipDay7>1</ShipDay7>");
						pw.println("<AdvanceDay>111111</AdvanceDay>");
						pw.println("<PlanHoriFirst>111111</PlanHoriFirst>");
						pw.println("<PlanHoriLast>111111</PlanHoriLast>");
						pw.println("<MaxOrdQtyPer>111111</MaxOrdQtyPer>");
						pw.println("<MaxStock>111111</MaxStock>");
						pw.println("<MaxStockPer>111111</MaxStockPer>");
						pw.println("<OrdRelease1>111111</OrdRelease1>");
						pw.println("<OrdRelease2>111111</OrdRelease2>");
						pw.println("<LotThreshold>111111</LotThreshold>");
						pw.println("<MinStockC>111111</MinStockC>");
						pw.println("<MinStockTgt>111111</MinStockTgt>");
						pw.println("<MinStockQty>111111</MinStockQty>");
						pw.println("<MinStockPer>111111</MinStockPer>");
						pw.println("<MaxStockC>111111</MaxStockC>");
						pw.println("<MaxStockTgt>111111</MaxStockTgt>");
						pw.println("<OrderDay>111111</OrderDay>");
						pw.println("<NotUsed3>111111</NotUsed3>");
						pw.println("<NotUsed4>111111</NotUsed4>");
						pw.println("<LeadVar1>111111</LeadVar1>");
						pw.println("<LeadVar2>111111</LeadVar2>");
						pw.println("<LeadVar3>111111</LeadVar3>");
						pw.println("<LeadVar4>111111</LeadVar4>");
						pw.println("<LeadVar5>111111</LeadVar5>");
						pw.println("<LeadVar6>111111</LeadVar6>");
						pw.println("<LeadVar7>111111</LeadVar7>");
						pw.println("<LeadVar8>111111</LeadVar8>");
						pw.println("<TransitLead1>111111</TransitLead1>");
						pw.println("<TransitLead2>111111</TransitLead2>");
						pw.println("<TransitLead3>111111</TransitLead3>");
						pw.println("<TransitLead4>111111</TransitLead4>");
						pw.println("<TransitLead5>111111</TransitLead5>");
						pw.println("<TransitLead6>111111</TransitLead6>");
						pw.println("<TransitLead7>111111</TransitLead7>");
						pw.println("<TransitLead8>111111</TransitLead8>");
						pw.println("<SafeTimeVar1>111111</SafeTimeVar1>");
						pw.println("<SafeTimeVar2>111111</SafeTimeVar2>");
						pw.println("<SafeTimeVar3>111111</SafeTimeVar3>");
						pw.println("<SafeTimeVar4>111111</SafeTimeVar4>");
						pw.println("<SafeTimeVar5>111111</SafeTimeVar5>");
						pw.println("<SafeTimeVar6>111111</SafeTimeVar6>");
						pw.println("<SafeTimeVar7>111111</SafeTimeVar7>");
						pw.println("<SafeTimeVar8>111111</SafeTimeVar8>");
						pw.println("<SafeStockVar1>111111</SafeStockVar1>");
						pw.println("<SafeStockVar2>111111</SafeStockVar2>");
						pw.println("<SafeStockVar3>111111</SafeStockVar3>");
						pw.println("<SafeStockVar4>111111</SafeStockVar4>");
						pw.println("<SafeStockVar5>111111</SafeStockVar5>");
						pw.println("<SafeStockVar6>111111</SafeStockVar6>");
						pw.println("<SafeStockVar7>111111</SafeStockVar7>");
						pw.println("<SafeStockVar8>111111</SafeStockVar8>");
						pw.println("<ServLevelVar1>111111</ServLevelVar1>");
						pw.println("<ServLevelVar2>111111</ServLevelVar2>");
						pw.println("<ServLevelVar3>111111</ServLevelVar3>");
						pw.println("<ServLevelVar4>111111</ServLevelVar4>");
						pw.println("<ServLevelVar5>111111</ServLevelVar5>");
						pw.println("<ServLevelVar6>111111</ServLevelVar6>");
						pw.println("<ServLevelVar7>111111</ServLevelVar7>");
						pw.println("<ServLevelVar8>111111</ServLevelVar8>");
						pw.println("<TargetStockC>111111</TargetStockC>");
						pw.println("<SmoothPlanOrd1>111111</SmoothPlanOrd1>");
						pw.println("<SmoothPlanOrd2>111111</SmoothPlanOrd2>");
						pw.println("<SmoothPlanOrd3>111111</SmoothPlanOrd3>");
						pw.println("<AdvMaxPer>111111</AdvMaxPer>");
						pw.println("<SupplierClosing>111111</SupplierClosing>");
						pw.println("<StockHandDateCode>111111</StockHandDateCode>");
						pw.println("<ProdPriorityVal>111111</ProdPriorityVal>");
						pw.println("<StockHandCont>111111</StockHandCont>");
						pw.println("<ProdRateVal>111111</ProdRateVal>");
						pw.println("<MinCustLife>111111</MinCustLife>");
						pw.println("<MaturityPer>111111</MaturityPer>");
						pw.println("<ConsLife>111111</ConsLife>");
						pw.println("<OrderDay1>111111</OrderDay1>");
						pw.println("<OrderDay2>111111</OrderDay2>");
						pw.println("<OrderDay3>111111</OrderDay3>");
						pw.println("<OrderDay4>111111</OrderDay4>");
						pw.println("<OrderDay5>111111</OrderDay5>");
						pw.println("<OrderDay6>111111</OrderDay6>");
						pw.println("<OrderDay7>111111</OrderDay7>");
						pw.println("<WeighWeekly>PPPPPP</WeighWeekly>");
						pw.println("<MinOrQC>111111</MinOrQC>");
						pw.println("<MaxOrdQtyC>111111</MaxOrdQtyC>");
						pw.println("<MinStockTrgt>111111</MinStockTrgt>");
						pw.println("<MinStockTrgt1>111111</MinStockTrgt1>");
						pw.println("<MinStockTrgt2>111111</MinStockTrgt2>");
						pw.println("<MinStockTrgt3>111111</MinStockTrgt3>");
						pw.println("<MinStockTrgt4>111111</MinStockTrgt4>");
						pw.println("<MinStockTrgt5>111111</MinStockTrgt5>");
						pw.println("<MinStockTrgt6>111111</MinStockTrgt6>");
						pw.println("<MinStockTrgt7>111111</MinStockTrgt7>");
						pw.println("<MinStockVar>111111</MinStockVar>");
						pw.println("<MinStockVar1>111111</MinStockVar1>");
						pw.println("<MinStockVar2>111111</MinStockVar2>");
						pw.println("<MinStockVar3>111111</MinStockVar3>");
						pw.println("<MinStockVar4>111111</MinStockVar4>");
						pw.println("<MinStockVar5>111111</MinStockVar5>");
						pw.println("<MinStockVar6>111111</MinStockVar6>");
						pw.println("<MinStockVar7>111111</MinStockVar7>");
						pw.println("<MinStockVarPer>111111</MinStockVarPer>");
						pw.println("<MinStockVarPer1>111111</MinStockVarPer1>");
						pw.println("<MinStockVarPer2>111111</MinStockVarPer2>");
						pw.println("<MinStockVarPer3>111111</MinStockVarPer3>");
						pw.println("<MinStockVarPer4>111111</MinStockVarPer4>");
						pw.println("<MinStockVarPer5>111111</MinStockVarPer5>");
						pw.println("<MinStockVarPer6>111111</MinStockVarPer6>");
						pw.println("<MinStockVarPer7>111111</MinStockVarPer7>");
						pw.println("<MaxStockTrgt>111111</MaxStockTrgt>");
						pw.println("<MaxStockTrgt1>111111</MaxStockTrgt1>");
						pw.println("<MaxStockTrgt2>111111</MaxStockTrgt2>");
						pw.println("<MaxStockTrgt3>111111</MaxStockTrgt3>");
						pw.println("<MaxStockTrgt4>111111</MaxStockTrgt4>");
						pw.println("<MaxStockTrgt5>111111</MaxStockTrgt5>");
						pw.println("<MaxStockTrgt6>111111</MaxStockTrgt6>");
						pw.println("<MaxStockTrgt7>111111</MaxStockTrgt7>");
						pw.println("<MaxStockVar>111111</MaxStockVar>");
						pw.println("<MinStockVar8>111111</MinStockVar8>");
						pw.println("<MaxStockVar1>111111</MaxStockVar1>");
						pw.println("<MaxStockVar2>111111</MaxStockVar2>");
						pw.println("<MaxStockVar3>111111</MaxStockVar3>");
						pw.println("<MaxStockVar4>111111</MaxStockVar4>");
						pw.println("<MaxStockVar5>111111</MaxStockVar5>");
						pw.println("<MaxStockVar6>111111</MaxStockVar6>");
						pw.println("<MaxStockVarPer>111111</MaxStockVarPer>");
						pw.println("<MaxStockVarPer1>111111</MaxStockVarPer1>");
						pw.println("<MaxStockVarPer2>111111</MaxStockVarPer2>");
						pw.println("<MaxStockVarPer3>111111</MaxStockVarPer3>");
						pw.println("<MaxStockVarPer4>111111</MaxStockVarPer4>");
						pw.println("<MaxStockVarPer5>111111</MaxStockVarPer5>");
						pw.println("<MaxStockVarPer6>111111</MaxStockVarPer6>");
						pw.println("<MaxStockVarPer7>111111</MaxStockVarPer7>");
						pw.println("<GRAdjust>111111</GRAdjust>");
						pw.println("<GRCustomOrder>111111</GRCustomOrder>");
						pw.println("<SafeTime2C>111111</SafeTime2C>");
						pw.println("<SafeTime2>111111</SafeTime2>");
						pw.println("<SafeTime2Var1>111111</SafeTime2Var1>");
						pw.println("<SafeTime2Var2>111111</SafeTime2Var2>");
						pw.println("<SafeTime2Var3>111111</SafeTime2Var3>");
						pw.println("<SafeTime2Var4>111111</SafeTime2Var4>");
						pw.println("<SafeTime2Var5>111111</SafeTime2Var5>");
						pw.println("<SafeTime2Var6>111111</SafeTime2Var6>");
						pw.println("<SafeTime2Var7>111111</SafeTime2Var7>");
						pw.println("<NumOfDays>111111</NumOfDays>");
						pw.println("<SafeTimeBased>111111</SafeTimeBased>");
						pw.println("<SafeTimeHist>111111</SafeTimeHist>");
						pw.println("<PlanRuleSel>111111</PlanRuleSel>");
						pw.println("<MinQtyVar>111111</MinQtyVar>");
						pw.println("<MinQtyVar1>111111</MinQtyVar1>");
						pw.println("<MinQtyVar2>111111</MinQtyVar2>");
						pw.println("<MinQtyVar3>111111</MinQtyVar3>");
						pw.println("<MinQtyVar4>111111</MinQtyVar4>");
						pw.println("<MinQtyVar5>111111</MinQtyVar5>");
						pw.println("<MinQtyVar6>111111</MinQtyVar6>");
						pw.println("<MinQtyVar7>111111</MinQtyVar7>");
						pw.println("<MinQtyPerVar>111111</MinQtyPerVar>");
						pw.println("<MinQtyPerVar1>111111</MinQtyPerVar1>");
						pw.println("<MinQtyPerVar2>111111</MinQtyPerVar2>");
						pw.println("<MinQtyPerVar3>111111</MinQtyPerVar3>");
						pw.println("<MinQtyPerVar4>111111</MinQtyPerVar4>");
						pw.println("<MinQtyPerVar5>111111</MinQtyPerVar5>");
						pw.println("<MinQtyPerVar6>111111</MinQtyPerVar6>");
						pw.println("<MinQtyPerVar7>111111</MinQtyPerVar7>");
						pw.println("<FrozenVar>111111</FrozenVar>");
						pw.println("<FrozenVar1>111111</FrozenVar1>");
						pw.println("<FrozenVar2>111111</FrozenVar2>");
						pw.println("<FrozenVar3>111111</FrozenVar3>");
						pw.println("<FrozenVar4>111111</FrozenVar4>");
						pw.println("<FrozenVar5>111111</FrozenVar5>");
						pw.println("<FrozenVar6>111111</FrozenVar6>");
						pw.println("<FrozenVar7>111111</FrozenVar7>");
						pw.println("<MaxStockVal>111111</MaxStockVal>");
						pw.println("<PlanRuleOptions>111111</PlanRuleOptions>");
						pw.println("<ProdProcessOptions>111111</ProdProcessOptions>");
						pw.println("<MaxQtyVar>111111</MaxQtyVar>");
						pw.println("<MaxQtyVar1>111111</MaxQtyVar1>");
						pw.println("<MaxQtyVar2>111111</MaxQtyVar2>");
						pw.println("<MaxQtyVar3>111111</MaxQtyVar3>");
						pw.println("<MaxQtyVar4>111111</MaxQtyVar4>");
						pw.println("<MaxQtyVar5>111111</MaxQtyVar5>");
						pw.println("<MaxQtyVar6>111111</MaxQtyVar6>");
						pw.println("<MaxQtyVar7>111111</MaxQtyVar7>");
						pw.println("<MaxQtyPerVar>111111</MaxQtyPerVar>");
						pw.println("<MaxQtyPerVar1>111111</MaxQtyPerVar1>");
						pw.println("<MaxQtyPerVar2>111111</MaxQtyPerVar2>");
						pw.println("<MaxQtyPerVar3>111111</MaxQtyPerVar3>");
						pw.println("<MaxQtyPerVar4>111111</MaxQtyPerVar4>");
						pw.println("<MaxQtyPerVar5>111111</MaxQtyPerVar5>");
						pw.println("<MaxQtyPerVar6>111111</MaxQtyPerVar6>");
						pw.println("<MaxQtyPerVar7>111111</MaxQtyPerVar7>");
						pw.println("<LotSizeUnit>111111</LotSizeUnit>");
						pw.println("<ShipTime1>111111</ShipTime1>");
						pw.println("<ShipTime2>111111</ShipTime2>");
						pw.println("<ShipTime3>111111</ShipTime3>");
						pw.println("<ShipTime4>111111</ShipTime4>");
						pw.println("<ShipTime5>111111</ShipTime5>");
						pw.println("<ShipTime6>111111</ShipTime6>");
						pw.println("<ShipTime7>111111</ShipTime7>");
						pw.println("<ReleaseLead>111111</ReleaseLead>");
						pw.println("<ApplyRelease>111111</ApplyRelease>");
						pw.println("<DetailSeries>111111</DetailSeries>");
						pw.println("<NegativeStock>111111</NegativeStock>");
						pw.println("<QtyUnit>UOM10</QtyUnit>");
						pw.println("<JITBosOptions>111111</JITBosOptions>");
						pw.println("<LotSizeThreshU1>PPPPPP</LotSizeThreshU1>");
						pw.println("<LotSizeThreshU2>PPPPPP</LotSizeThreshU2>");
						pw.println("<LotSizeThreshU3>PPPPPP</LotSizeThreshU3>");
						pw.println("<LotSizeThreshU4>PPPPPP</LotSizeThreshU4>");
						pw.println("<LotSizeThreshU5>PPPPPP</LotSizeThreshU5>");
						pw.println("<LotSizeThreshFr1>111111</LotSizeThreshFr1>");
						pw.println("<LotSizeThreshFr2>111111</LotSizeThreshFr2>");
						pw.println("<LotSizeThreshFr3>111111</LotSizeThreshFr3>");
						pw.println("<LotSizeThreshFr4>111111</LotSizeThreshFr4>");
						pw.println("<LotSizeThreshFr5>111111</LotSizeThreshFr5>");
						pw.println("<LotSizeThreshR1>111111</LotSizeThreshR1>");
						pw.println("<LotSizeThreshR2>111111</LotSizeThreshR2>");
						pw.println("<LotSizeThreshR3>111111</LotSizeThreshR3>");
						pw.println("<LotSizeThreshR4>111111</LotSizeThreshR4>");
						pw.println("<LotSizeThreshR5>111111</LotSizeThreshR5>");
						pw.println("<ApplyLotMOQ>111111</ApplyLotMOQ>");
						pw.println("<ApplyLotMOQFirm>111111</ApplyLotMOQFirm>");
						pw.println("<ApplyLotMOQStockTran>111111</ApplyLotMOQStockTran>");
						pw.println("<ApplyLotMOQReorder>111111</ApplyLotMOQReorder>");
						pw.println("<ApplyLotMOQSched>111111</ApplyLotMOQSched>");
						pw.println("<OrdFrequencyY>111111</OrdFrequencyY>");
						pw.println("<ExtConsumLife>111111</ExtConsumLife>");
						pw.println("<IdealConsumLife>111111</IdealConsumLife>");
						pw.println("<MinConsumLife>111111</MinConsumLife>");
						pw.println("<Risk1>111111</Risk1>");
						pw.println("<Risk2>111111</Risk2>");
						pw.println("<Risk3>111111</Risk3>");
						pw.println("<Risk4>111111</Risk4>");
						pw.println("<SplitOrderMode>111111</SplitOrderMode>");
						pw.println("<MaxDates>111111</MaxDates>");
						pw.println("<DateLotSize>111111</DateLotSize>");
						pw.println("<DateMin>111111</DateMin>");
						pw.println("<DateNum>111111</DateNum>");
						pw.println("<DevStartHist>201701</DevStartHist>");
						pw.println("<DevEndHist>201701</DevEndHist>");
						pw.println("<DevHist>111111</DevHist>");
						pw.println("<WeightWeek1>111111</WeightWeek1>");
						pw.println("<WeightWeek2>111111</WeightWeek2>");
						pw.println("<WeightWeek3>111111</WeightWeek3>");
						pw.println("<WeightWeek4>111111</WeightWeek4>");
						pw.println("<WeightWeek5>111111</WeightWeek5>");
						pw.println("<WeightWeek6>111111</WeightWeek6>");
						pw.println("<WeightWeek7>111111</WeightWeek7>");
						pw.println("<Blank1></Blank1>");
						pw.println("<Blank2></Blank2>");
						pw.println("<Blank3></Blank3>");
						pw.println("<Blank4></Blank4>");
						pw.println("<Blank5></Blank5>");
						pw.println("<Blank6></Blank6>");
						pw.println("<Blank7></Blank7>");
						pw.println("<Blank8></Blank8>");
						pw.println("<Blank9></Blank9>");
						pw.println("<Blank10></Blank10>");
						pw.println("<Blank11></Blank11>");
						pw.println("<Blank12></Blank12>");
						pw.println("<Blank13></Blank13>");
						pw.println("<Blank14></Blank14>");
						pw.println("<Blank15></Blank15>");
						pw.println("<Blank16></Blank16>");
						pw.println("<Blank17></Blank17>");
						pw.println("<Blank18></Blank18>");
						pw.println("<DaySpec1>111111</DaySpec1>");
						pw.println("<DaySpec2>111111</DaySpec2>");
						pw.println("<DaySpec3>111111</DaySpec3>");
						pw.println("<DaySpec4>111111</DaySpec4>");
						pw.println("<DaySpec5>111111</DaySpec5>");
						pw.println("<DaySpec6>111111</DaySpec6>");
						pw.println("<DaySpec7>111111</DaySpec7>");
						pw.println("<ManageMode>111111</ManageMode>");
						pw.println("<QuanLost>111111</QuanLost>");
						pw.println("<BBDBased>111111</BBDBased>");
						pw.println("<PlanOrderCalc>111111</PlanOrderCalc>");
						pw.println("<OutStock1>111111</OutStock1>");
						pw.println("<OutStock2>111111</OutStock2>");
						pw.println("<WeightRefSeries>111111</WeightRefSeries>");
						pw.println("</Item>");
					}

				}
				pw.println("</Planning>");
				pw.flush();
				fw.flush();
				pw.close();
				fw.close();
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		public static void main(String[] args) {

			new WeekPlanning().writeFile("txt", 1);
			new WeekPlanning().writeFile("xml", 1);

		}
	

}
