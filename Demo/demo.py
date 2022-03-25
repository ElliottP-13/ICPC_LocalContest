
if __name__ == "__main__":
    n = input()  # read the first line (n)
    n = int(n)

    for i in range(n):
        line = input()  # read the next line
        line = line.split(' ')  # split on the space

        # parse a, b
        a = int(line[0])
        b = int(line[1])

        print(a + b)
