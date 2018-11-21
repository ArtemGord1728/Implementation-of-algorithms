def swap_items(array, right, left):
    if left > right:
        temp = array[left]
        array[left] = array[right]
        array[right] = temp


def bubble_sort(array_items):
    swapped = False

    for n in array_items:
        if array_items[n] > array_items[n + 1]:
            swap_items(array_items, n + 1, n)
            swapped = True