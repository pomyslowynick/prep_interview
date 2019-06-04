# Solution provided to me by my paired interviewer on pramp,
# proved to be too hard for me.
# Given two strings of uppercase letters source and target, 
# list (in string form) a sequence of edits to convert from 
# source to target that uses the least edits possible.
# For example, with strings source = "ABCDEFG", 
# and target = "ABDFFGH" we might return: 
# ["A", "B", "-C", "D", "-E", "F", "+F", "G", "+H"]

def diffBetweenTwoStrings(source, target):
    N, M = len(source), len(target)

    # Create two dimensional array to store number of changes needed 
    # for each combination
    memo = [[None] * M for _ in range(N)]

    def dp(i, j):
        if (i == N) or (j == M):
            return max(N - i, M - j)
        if memo[i][j] is None:
            if source[i] == target[j]:
                memo[i][j] = 0 + dp(i + 1, j + 1)
            else:
                memo[i][j] = 1 + min(dp(i + 1, j), dp(i, j + 1))
        return memo[i][j]

    result, i, j = [], 0, 0
    while (i < N) and (j < M):
        if source[i] == target[j]:
            result.append(source[i])
            i += 1
            j += 1
        else:
            if dp(i + 1, j) <= dp(i, j + 1):
                result.append('-' + source[i])
                i += 1
            else:
                result.append('+' + target[j])
                j += 1
    return result + ['-' + c for c in source[i:]] + ['+' + c for c in target[j:]]

source = "ABCDEFG"
target = "ABDFFfsGH"
print(diffBetweenTwoStrings(source,target))