import re

def solution(new_id):
    new_id = new_id.lower()  # 1단계
    new_id = re.sub('[^a-z0-9\-_.]', '', new_id)  # 2단계
    new_id = re.sub('\.{2,}', '.', new_id)  # 3단계
    new_id = new_id.strip('.')  # 4단계
    new_id = 'a' if not new_id else new_id  # 5단계
    new_id = new_id[:15].rstrip('.')  # 6단계
    while len(new_id) < 3:  # 7단계
        new_id += new_id[-1]
    return new_id