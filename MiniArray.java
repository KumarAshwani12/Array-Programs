class MiniArray
{
public static void main(String... s)
{
int i,mini;
int a[]={-10,-5,43,72,63,2,3,3,7,2};
mini=a[0];
for(i=0;i<10;i++)
{
if(a[i]<mini)
{
mini=a[i];
}
}
System.out.println("Minimum :" +mini);
}
}