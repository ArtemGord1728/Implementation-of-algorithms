#include <iostream>
#include <ctime>

using namespace std;


void Swap(int mas[], int left, int right)
{
	if (left > right)
	{
		int item = mas[left];
		mas[left] = mas[right];
		mas[right] = item;
	}
}

int main()
{
	const int size = 5;
	int mas[size] = { 1, 3, 2, 5, 4 };
	bool isSwapped = false;

	for (int y = 0; y < size; y++)
	{
		cout << mas[y] << " ";
	}
	cout << endl;


	do
	{
		for (int x = 0; x < size - 1; x++)
		{
			if (mas[x] > mas[x + 1])
			{
				isSwapped = true;
				Swap(mas, x + 1, x);
			}
		}
	} while (isSwapped == false);


	for (int i = 0; i < size; i++)
	{
		cout << mas[i] << " ";
	}



	
	return 0;
}