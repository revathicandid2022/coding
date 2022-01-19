class t
{
public static void main(String[] args)
{
for(int i=1;i<=4;i++)
{
for(int j=i;j<=4;j++)
{
System.out.print("  ");
}
/*for(int j=1;j<i;j++)//j<=i is changed in j<i//
{
System.out.print("k ");
}*/
for(int j=1;j<=i;j++)// or j<-i is changed in j<i//
{
System.out.print("k ");
}
System.out.println();
}
}
}