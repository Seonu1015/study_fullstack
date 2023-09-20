from django.contrib import admin
from .models import Question, Choice

class ChoiceAdmin(admin.ModelAdmin):
    # fields = ('choice_text', 'votes', 'question')

    # fieldsets = (
    #     ('선택', {
    #         'fields' : ['choice_text', 'votes'], 'classes' : ['collapse']
    #     }),
    #     ('질문', {
    #         'fields' : ['question'], 'classes' : ['collapse'] # 파이썬 튜플은 하나짜리는 무조건 ,를 붙인다. ('question',) 를 써서 () 사용해도 괜찮다.
    #     }),
    # )

    list_filter = ('choice_text', 'question')

    search_fields = ('choice_text',)

admin.site.register(Question)
admin.site.register(Choice, ChoiceAdmin)
