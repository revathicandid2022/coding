class IncreStar
{
public static void main(String[] args)
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++) //increasing condition j<=4 is changed in j<=i//
{
System.out.print("* ");
}
System.out.println();
}
}
}