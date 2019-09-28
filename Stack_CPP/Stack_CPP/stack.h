#pragma once
#include <iostream>

template <typename T>
class Stack
{
private:
	class Node
	{
	public:
		Node& next;
		T& item;
	};

	unsigned int size_num = 0;
	Node* top_stack;
public:
	bool is_empty() {return size_num == 0};
	int size() { return size_num; }
	void push(T value);
	T pop();
};