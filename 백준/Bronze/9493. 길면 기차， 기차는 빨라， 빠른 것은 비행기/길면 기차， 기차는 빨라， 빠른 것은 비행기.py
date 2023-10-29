import sys


# Get arrived time as Second
def get_arrived_time(distance_km, speed_km) -> float:
    distance_m = distance_km * 1000
    speed_m_per_s = speed_km * 1000 / 60 / 60
    arrive_time = distance_m / speed_m_per_s
    return arrive_time


def get_formatted_time(time) -> str:
    seconds: int = time % 60
    minutes: int = int(time / 60)
    hours: int = 0

    if minutes >= 60:
        hours = int(minutes / 60)
        minutes = minutes % 60

    # Make 0:00:00 format
    mm: str = ("0" + str(minutes)) if minutes < 10 else str(minutes)
    ss: str = ("0" + str(seconds)) if seconds < 10 else str(seconds)
    hh: str = str(hours)
    return f'{hh}:{mm}:{ss}'


while True:
    input_list = list(map(int, sys.stdin.readline().split()))
    M, A, B = input_list[0], input_list[1], input_list[2]

    # End condition
    if M == 0 and A == 0 and B == 0:
        break

    train_time: float = get_arrived_time(M, A)
    airplane_time: float = get_arrived_time(M, B)
    time_difference: int = round(train_time - airplane_time)

    answer = get_formatted_time(time_difference)
    print(answer)
