class array_string
{
    public static void main(String[] args)
    
    // {
        // int a[]={1,2,3,4};                                       //forming and initilization of array

        // int a[]=new int[5];                                         //forming of array
        // System.out.println("enter element of array:");

        // Scanner sc=new Scanner(System.in);                          //for array input
        // for(int j=0;j<5;j++)                  
        // {
        //     a[j]=sc.nextInt();
        // }

        // Arrays.sort(a);                                             //for array sorting

        // System.out.print("element of array are: ");

        // for(int i:a)                                                // printing array
        // {
        //     System.out.print(i+" ");
        // }
    // }


    {
        String s="PRADhuman kUMAR";
        String s2=new String("PRADhuman kUMAR");


        if(s==s2)                                            //its compare a/c to variable
        {
            System.out.println("yes both string are equal");
        }
        else
        {
            System.out.println("both string are not equal");
        }


        if(s.equals(s2))                                     //its compare a/c to content of variable
        {
            System.out.println("yes both string are equal");
        }
        else
        {
            System.out.println("both string are not equal");
        }


        System.out.println("length of string is "+s.length());        //length of string
        System.out.println(s.toUpperCase());                          //convert to uppercase
        System.out.println(s.toLowerCase());                          //convert to lowercase
        String s3= s.concat(" verma");                      //add something but create a new variable-
        System.out.println("concat is "+s3);                //-because string is emutable in java
    }
}