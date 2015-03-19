public class Pile
{
	int[] etage;
	int taille;
	int position;

	public Pile(int taille)
	{
		super();
		this.taille = taille;
		this.etage = new int[taille];
		this.position = 0;
	}

	public void empiler(int element)
	{
		if (this.position != this.taille && element > -1)
		{
			this.etage[this.position + 1] = element;
			this.position = this.position + 1;
		}
		else
		{
			System.out.println("La pile pleine ou élément négatif");
		}
	}

	public int depiler()
	{
		if (this.position != 0)
		{
			this.position = this.position - 1;
			return this.etage[this.position];
		}
		else
		{
			System.out.println("La pile est vide");
			return -1;
		}
	}

	public int afficherSommet()
	{
		if (this.position != 0)
			return this.etage[this.position];
		else
		{
			System.out.println("La pile est vide");
			return -1;
		}
	}

	public int taillePile()
	{
		return this.position;
	}

	public int capacitePile()
	{
		return this.taille;
	}
}