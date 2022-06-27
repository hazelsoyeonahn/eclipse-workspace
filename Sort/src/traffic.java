/**
 * This class is designed for identifying density of cities
 * This class will let people know what testing center is available
 * and how many people needs to be tested
 * This class is designed using only one class for converting code to html
 * @author fvx3255
 */
public class traffic {
    public static void main(String[] args){
    	
 

        //it's an emergency situation where many people needs to get tested
    	//onehunga
        int one_t = 400;
        //penrose
        int pen_t = 52;
        //mount wellington
        int mtW_t = 1022;
        //new market
        int new_t = 829;
        //mount eden
        int mtE_t = 429;
        //remuera
        int rem_t = 522;
       
        //how many covid19 tesing services are available in each area
        int one_c = 4;
        int pen_c = 2;
        int mtW_c = 3;
        int new_c = 1;
        int mtE_c = 8;
        int rem_c = 6;
       
        //density of patients before building popup testing center
        int one_d = one_t/one_c;
        int pen_d = pen_t/pen_c;
        int mtW_d = mtW_t/mtW_c;
        int new_d = new_t/new_c;
        int mtE_d = mtE_t/mtE_c;
        int rem_d = rem_t/rem_c;
       
        //how dense it is to test people per clinic
        System.out.println("How dense people in the clinic without popup place:");
        System.out.println("Onehunga: "+one_d);
        System.out.println("Penrose: "+pen_d);
        System.out.println("Mount Wellington: "+mtW_d);
        System.out.println("New Market: "+new_d);
        System.out.println("Mount Eden: "+mtE_d);
        System.out.println("Remuera: "+rem_d);
       
        //ideal number of testing for clinics
        int ideal_d = 50;
       
        //how many popup station do we need for each area
        /*int one_p = one_d/ideal_d;
        int pen_p = pen_d/ideal_d;
        int mtW_p = mtW_d/ideal_d;
        int new_p = new_d/ideal_d;
        int mtE_p = mtE_d/ideal_d;
        int rem_p = rem_d/ideal_d;
       
        System.out.println("\nWe need");
        System.out.println(one_p+" more popup station for Onehunga");
        System.out.println(pen_p+" more popup station for Penrose");
        System.out.println(mtW_p+" more popup station for Mount Wellington");
        System.out.println(mtE_p+" more popup station for Mount Eden");
        System.out.println(rem_p+" more popup station for Remuera");*/
           
        //stadium, mall can cover 100 people
        //high school can cover 100 people
       
        //popup place near Onehunga
        int stJosephSchool = 100;
        int oneHungaHighSchool = 100;
        int oneSchoolGlobal = 100;
       
        //popup place near Penrose
        int MtSmartStadium = 150;
        
        //popup place near Mount Wellington
        int SylviaPark = 100;
        int SylviaParkSchool = 100;
        int StanhopeRoadSchool = 100;
        int StMaryPrimarySchool = 100;
        int EllerslieSchool = 100;
        int StPatrickSchool = 100;
        int RiverinaSchool = 100;
        int ElmParkSchool = 100;
        
        //popup place near New Market
        int NewmarketPrimary = 100;
        int AucklandCityHospital = 200;
        int AucklandGrammarSchool = 100;
        int ACGParnellCollege = 100;
        int MercyHospital = 200;
        int EpsomGirlsGrammarSchool = 100;
       
        //popup place near Mount Eden
        int WesleyPrimarySchool = 100;
        int MaungawhauSchool = 100;
       
        //popup place near Remuera
        int KingsSchool = 100;
        int VictoriaAvenueSchool = 100;
       
        //algorithm for test people efficiently
        //remainder of people to be tested
        int one_r = one_t - (one_c*ideal_d);
        int pen_r = pen_t - (pen_c*ideal_d);
        int mtW_r = mtW_t - (mtW_c*ideal_d);
        int new_r = new_t - (new_c*ideal_d);
        int mtE_r = mtE_t - (mtE_c*ideal_d);
        int rem_r = rem_t - (rem_c*ideal_d);
       
        int capacity_one=0, capacity_pen=0, capacity_mtw = 0, capacity_new=0, capacity_mte=0, capacity_rem= 0;
        
        //onehunga algo
        if(one_r > 0){
        for(int i=1; i<=one_r; ++i){
            if(stJosephSchool != 0){
                --stJosephSchool;
            }
            else if(oneHungaHighSchool != 0){
                --oneHungaHighSchool;
            }
            else {
                --oneSchoolGlobal;
            }
        }}
        else if(one_r < 0){
            capacity_one = Math.abs(one_r);
            System.out.println(capacity_one+ " people needs to be tested in Onehunga");
        }
       
        if(stJosephSchool != 0){
            System.out.println(stJosephSchool+" people capacity left in Saint Joseph");
        }
        if(oneHungaHighSchool != 0){
            System.out.println(oneHungaHighSchool+" people capacity left in Onehunga High School");
        }
        if(oneSchoolGlobal != 0){
            System.out.println(oneSchoolGlobal+" people capacity left in One School Global");
        }
       
        //penrose algo
        if(pen_r > 0){
            for(int i=1; i<=pen_r; ++i){
                if(MtSmartStadium != 0){
                    --MtSmartStadium;
                }
            }
        }
        else{
            capacity_pen = Math.abs(pen_r);
            System.out.println(capacity_pen+ " people needs to be tested in Penrose");
        }
        if(MtSmartStadium != 0){
            System.out.println(MtSmartStadium+" people capacity left in Mountain Smart Stadium");
        }
       
        //mtWellington algo
        if(mtW_r > 0){
            int count = mtW_r;
           for(int i=1; i<=mtW_r;++i){
            if(SylviaPark != 0){
                --SylviaPark;
              }
            else if(SylviaParkSchool != 0){
                --SylviaParkSchool;
            }
            else if(StanhopeRoadSchool != 0){
                --StanhopeRoadSchool;
            }
            else if(StMaryPrimarySchool != 0){
                --StMaryPrimarySchool;
            }
            else if(EllerslieSchool != 0){
                --EllerslieSchool;
            }
            else if(StPatrickSchool != 0){
                --StPatrickSchool;
            }
            else if(RiverinaSchool != 0){
                --RiverinaSchool;
            }
            else if(ElmParkSchool != 0){
                --ElmParkSchool;
            }
            else {
                capacity_mtw = count;
                System.out.println(capacity_mtw+ " people needs to be tested in Mount Wellington");
                i = mtW_r;
            }
            --count;
           }
        }
        else{
            capacity_mtw = Math.abs(mtW_r);
            System.out.println(capacity_mtw+ " people needs to be tested in Mount Wellington");
        }
        if(SylviaPark != 0){
            System.out.println(SylviaPark+" people capacity left in Sylvia Park");
        }
        if(SylviaParkSchool != 0){
        System.out.println(SylviaParkSchool+" people capacity left in Sylvia Park School");
        }
        if(StanhopeRoadSchool != 0){
        System.out.println(StanhopeRoadSchool+" people capacity left in Stanhope Road School");
        }
        if(StMaryPrimarySchool != 0){
        System.out.println(StMaryPrimarySchool+" people capacity left in St Mary Primary School");
        }
        if(EllerslieSchool != 0){
        System.out.println(EllerslieSchool+" people capacity left in Ellerslie School");
        }
        if(StPatrickSchool != 0){
        System.out.println(StPatrickSchool+" people capacity left in Saint Patrick School");
        }
        if(RiverinaSchool != 0){
        System.out.println(RiverinaSchool+" people capacity left in Riverina School");
        }
        if(ElmParkSchool != 0){
        System.out.println(ElmParkSchool+" people capacity left in Elm Park School");
        }
        
        //mount eden algo
        if(mtE_r > 0) {
        	int count = mtE_r;
        	for(int i=1; i<=mtE_r; ++i) {
        		if(WesleyPrimarySchool != 0) {
        			--WesleyPrimarySchool;
        		}
        		else if(MaungawhauSchool != 0) {
        			--MaungawhauSchool;
        		}
        		else {
        			capacity_mte = count;
        			System.out.println(capacity_mte+ " people needs to be tested in Mount Eden");
        			i = mtE_r;
        		}
        		--count;
        	}
        }
        else {
        	capacity_mte = Math.abs(mtE_r);
        	System.out.println(capacity_mtw+ " people needs to be tested in Mount Eden");
        }
        if(WesleyPrimarySchool != 0) {
        	System.out.println(WesleyPrimarySchool+" people capacity left in Wesley Primary School");
        }
        if(MaungawhauSchool != 0) {
        	System.out.println(MaungawhauSchool+" people capacity left in MaungawhauSchool");
        }
    
        //new market algo
        if(new_r >0) {
        	int count = new_r;
        	for(int i=1; i<=new_r; ++i) {
        		if(NewmarketPrimary != 0) {
        			--NewmarketPrimary;
        		}
        		else if(AucklandCityHospital != 0) {
        			--AucklandCityHospital;
        		}
        		else if(AucklandGrammarSchool != 0) {
        			--AucklandGrammarSchool;
        		}
        		else if(ACGParnellCollege != 0) {
        			--ACGParnellCollege;
        		}
        		else if(MercyHospital != 0) {
        			--MercyHospital;
        		}
        		else if(EpsomGirlsGrammarSchool != 0) {
        			--EpsomGirlsGrammarSchool;
        		}
        		else {
        			capacity_new = count;
        			System.out.println(capacity_new+ " people needs to be tested in New Market");
        			i = new_r;
        		}
        		--count;
        	}
        }
        else {
        	capacity_new = Math.abs(new_r);
        	System.out.println(capacity_new+ " people needs to be tested in New Market");
        }
        if(NewmarketPrimary != 0) {
        	System.out.println(NewmarketPrimary+" people capacity left in New Market Primary");
        }
        if(AucklandCityHospital != 0) {
        	System.out.println(AucklandCityHospital+" people capacity left in Auckland City Hospital");
        }
        if(AucklandGrammarSchool != 0) {
        	System.out.println(AucklandGrammarSchool+" people capacity left in Auckland Grammar School");
        }
        if(ACGParnellCollege != 0) {
        	System.out.println(ACGParnellCollege+" people capacity left in ACG Parnell College");
        }
        if(MercyHospital != 0) {
        	System.out.println(MercyHospital+" people capacity left in Mercy Hospital");
        }
        if(EpsomGirlsGrammarSchool != 0) {
        	System.out.println(EpsomGirlsGrammarSchool+" people capacity left in Epsom Girls Grammar School");
        }
        
        //remuera algo
        if(rem_r > 0) {
        	int count = rem_r;
        	for(int i=1; i<=rem_r; ++i) {
        		if(KingsSchool != 0) {
        			--KingsSchool;
        		}
        		else if(VictoriaAvenueSchool != 0) {
        			--VictoriaAvenueSchool;
        		}
        		else {
        			capacity_rem = count;
        			System.out.println(capacity_rem+ " people needs to be tested in Remuera");
        			i = rem_r;
        		}
        		--count;
        	}
        }
        else {
        	capacity_rem = Math.abs(rem_r);
        	System.out.println(capacity_new+ " people needs to be tested in Remuera");
        }
        if(KingsSchool != 0) {
        	System.out.println(KingsSchool+" people capacity left in King's School");
        }
        if(VictoriaAvenueSchool != 0) {
        	System.out.println(VictoriaAvenueSchool+" people capacity left in Victoria Avenue School");
        }
        
       
    }
}
