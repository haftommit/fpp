package week2lesson7;

class myTableTest{

    public static void  main (String [] a){

        MyTable t=new MyTable();

        t.add('a', "Andrew");

        t.add('b', "Bill");

        t.add('c', "Charlie");

        t.add('s', "Sara");

        t.add('l', "layan");

        t.add('r', "rasha");

        System.out.println(t.get('s'));

        System.out.println(t.get('b'));

        System.out.println(t.get('a'));

        System.out.println(t.get('l'));

        System.out.println(t);

        t.add('s', "Sonds");

        System.out.println("After insert new entry in exsting index ");

        System.out.println(t);

    }

}

 class MyTable {

        private Entry[] entries;

        public MyTable () {

            entries =new Entry[26];

        }

        public String get(char c){

            return entries[getIndex(c)].toString();

        }
        
        ///getting the index based on char Ascii No starting from 97-> A to 123->Z

        private int getIndex(char c){

            int ascii = (int) c;

            int counter=97;

            int index=0;

            for ( index=0;index<entries.length;index++){

                if (counter==ascii){

                    break;

                }

                counter++;

            }

            return index;

        }

        public void add(char c, String s) {

            entries[getIndex(c)]= new Entry(s,c);

        }

        public String toString() {

            String str="";

            for (Entry ent : entries){

                if (ent !=null )

                    if (str.equals(""))

                        str= "{"+ ent.ch + "," + ent.str + "}" ;

                    else

                        str+= ",{"+ ent.ch + "," + ent.str + "}" ;

            }

            return str;

        }
        private class Entry {

            char ch;

            String str;

            Entry(String str, char ch){

                this.str=str;

                this.ch=ch;

            }
            public String toString() {

                return ch + "->" + str;

            }

        }
}
/**
s->Sara

b->Bill

a->Andrew

l->layan

{a,Andrew},{b,Bill},{c,Charlie},{l,layan},{r,rasha},{s,Sara}

After insert new entry in exsting index 

{a,Andrew},{b,Bill},{c,Charlie},{l,layan},{r,rasha},{s,Sonds}
*/