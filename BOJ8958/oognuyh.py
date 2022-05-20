import sys

def do(ox: str):
    def getScore(answer: str) -> int:
        acc[0] = acc[0] + 1 if (answer == "O") else 0

        return acc[0]

    acc = [0]

    print(sum([getScore(answer) for answer in ox]))
    
if __name__ == "__main__":
    for _ in range(int(sys.stdin.readline())):
        do(ox = sys.stdin.readline())
