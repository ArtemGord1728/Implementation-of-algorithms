#pragma once
#include <iostream>
#include <vector>

using namespace std;

class BinarySearch
{
public:
	bool isSort(vector<int> arr);
	void sort_array(vector<int> arr);
	void binary_search(vector<int> arr, int elem);
};