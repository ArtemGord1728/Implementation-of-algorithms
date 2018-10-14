def binary_search(list, item):
    low = 0
    high = len(list) - 1

    while low <= high:
        mid = (low + high)
        guess_item = list[mid]
        if guess_item == item:
            return item
        if guess_item > item:
            high = mid - 1
        else:
            low = mid + 1
    return None

items = [1, 2, 3, 4]

print(binary_search(items, 4))