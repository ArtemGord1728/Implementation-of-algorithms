#include <iostream>
#include <vector>

void sort_selection(std::vector<int> arr)
{
	int max = 0;
	for (int i = 0; i < arr.size(); i++)
	{
		for (int j = i + 1; j < arr.size(); j++)
		{

		}
	}
}


int main() 
{
	std::vector<int> arr_test;
	arr_test.push_back(1);
	arr_test.push_back(2);
	arr_test.push_back(88);
	arr_test.push_back(6);
	arr_test.push_back(8);

	sort_selection(arr_test);

	return 0;
}