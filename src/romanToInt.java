class romanToInt {
    public int romanToInt(String s) {
        int num = 0;
        java.util.HashMap<Character, Integer> map = new java.util.HashMap<>(); 
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] ch = s.toCharArray();
        for(int i = ch.length-1;i>=0;i--){
            if(i>0 && ch[i]=='V' && ch[i-1]=='I'){
                num+=4;
                i--;
            }
            else if(i>0 && ch[i]=='X' && ch[i-1]=='I'){
                num+=9;
                i--;
        }
            else if(i>0 && ch[i]=='L' && ch[i-1]=='X'){
                num+=40;
                i--;
        }
            else if(i>0 && ch[i]=='C' && ch[i-1]=='X'){
                num+=90;
                i--;
        }
            else if(i>0 && ch[i]=='D' && ch[i-1]=='C'){
                num+=400;
                i--;
        }
            else if(i>0 && ch[i]=='M' && ch[i-1]=='C'){
                num+=900;
                i--;
            }
            else{
                num += map.get(ch[i]);
            }
        
        }
        return num;
    }
}
