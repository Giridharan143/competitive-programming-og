def count_like_dislike (A, P):
    count=0
    for i in range(len(A)):
        if A[i]==P[i]:
            count+=1
    return count


A = "A1"
P = '111111'

out_ = count_like_dislike(A, P)
print (out_)