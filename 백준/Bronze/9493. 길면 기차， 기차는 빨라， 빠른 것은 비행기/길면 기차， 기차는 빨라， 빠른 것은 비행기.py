import sys


# Get arrived time as Second
def get_arrived_time(distance_km, speed_km) -> float:
    distance_m = distance_km * 1000
    speed_m_per_s = speed_km * 1000 / 60 / 60
    arrive_time = distance_m / speed_m_per_s
    return arrive_time


def get_formatted_time(time: int) -> str:
    # time unit -> seconds

    # Make 0:00:00 format
    # Use zfill
    seconds: str = str(time % 60).zfill(2)
    minutes: str = str((time // 60) % 60).zfill(2)
    hours: str = str(time // 3600).zfill(1)
    return f'{hours}:{minutes}:{seconds}'


while True:
    M, A, B = map(int, sys.stdin.readline().split())
    # End condition
    if M == 0 and A == 0 and B == 0:
        break

    train_time: float = get_arrived_time(M, A)
    airplane_time: float = get_arrived_time(M, B)
    time_difference: int = round(train_time - airplane_time)

    answer = get_formatted_time(time_difference)
    print(answer)
