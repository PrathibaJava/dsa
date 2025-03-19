package com.google.dsa2025.g6recursion;

public class Sample {

        String	name;
public	Sample()	{
            this.name	=	"Default	Name";
        }
//	This	is	called	a	one	argument	constructor.
public	Sample(String	name)	{
            this.name	=	name;
        }
        public	static	void	main(String[]	args)	{
            Sample	animal	=	new	Sample();
            System.out.println(animal.name);
        }

}
